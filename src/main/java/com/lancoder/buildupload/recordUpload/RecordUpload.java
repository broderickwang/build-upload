package com.lancoder.buildupload.recordUpload;

import com.google.gson.Gson;
import com.lancoder.buildupload.dto.PlantResultDTO;
import com.lancoder.buildupload.dto.ReseponseDTO;
import com.lancoder.buildupload.dto.WorkerAttendanceAddDto;
import com.lancoder.buildupload.dto.WorkerAttendanceDTO;
import com.lancoder.buildupload.entity.HrDept;
import com.lancoder.buildupload.entity.HrEmployee;
import com.lancoder.buildupload.entity.StParameter;
import com.lancoder.buildupload.entity.StProject;
import com.lancoder.buildupload.repository.*;
import com.lancoder.buildupload.util.AesUtils;
import com.lancoder.buildupload.util.PlantUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Component
@EnableScheduling
public class RecordUpload {

    /**
     *
     */
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * appid和密钥
     */
    @Autowired
    private ParameterRepository parameterRepository;

    /**
     * 班组
     */
    @Autowired
    private DeptRepository deptRepository;

    /**
     * 人员
     */
    @Autowired
    private HrEmployeeRepository hrEmployeeRepository;

    /**
     * 工程
     */
    @Autowired
    private ProjectRepository projectRepository;

    /**
     * 考勤记录
     */
    @Autowired
    private RecordRepository recordRepository;


    @Scheduled(cron = "50 30 8 * * ?") // 每天晚上23点执行一次
    public void getToken() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String time = sdf.format(new Date());
        //查询数据库中appid和密钥
        String appid = "";
        String appSecret = "";
        List<StParameter> parameters = parameterRepository.findAll();
        if (parameters == null || parameters.size() <= 0) {
            return;
        }
        for (StParameter stParameter : parameters) {
            if ("应用ID".equals(stParameter.getpName())) {
                appid = stParameter.getPValue();
            } else if ("应用密钥".equals(stParameter.getpName())) {
                appSecret = stParameter.getPValue();
            }
        }
        //查询数据库中的工程
//        List<Object> proCode = projectRepository.getProCode();
        String projectCode = String.valueOf(appid);
        //查询数据库中所有的班组
        List<Object> deptInfo = deptRepository.getDeptInfo();
        //for循环班组信息，通过班组deptId去人员表中查询该班组所属人员的身份证
        for (Object dept : deptInfo) {
            //查询每个班组下面有多少人
            Object[] tmpDepts = (Object[]) dept;
            List<Object> objects = recordRepository.getAllRecord(Long.valueOf(tmpDepts[1].toString()), "20190709");
            if (objects == null || objects.size() <= 0) {
                continue;
            }
            List<WorkerAttendanceDTO> persons = new ArrayList<>();
            objects.forEach(new Consumer<Object>() {
                @Override
                public void accept(Object o) {
                    Object[] os = (Object[]) o;

                    WorkerAttendanceDTO workerAttendance = new WorkerAttendanceDTO(String.valueOf(os[0]), String.valueOf(os[1])
                            , String.valueOf(os[2]), String.valueOf(os[3]));
                    persons.add(workerAttendance);
                }
            });
            int num = 0;
            //查看总共多少人
            int personNum = persons.size();
            num = personNum / 10;
            if (personNum % 10 > 0) {
                num += 1;
            }
            //外层for循环判断要循环几次
            int forCount = 0;
            for (int i = 0; i < num; i++) {
                ReseponseDTO dto = new ReseponseDTO();
                WorkerAttendanceAddDto workerAttendanceAdd = new WorkerAttendanceAddDto();
                List<WorkerAttendanceAddDto.DataList> listData = new ArrayList<>();
                workerAttendanceAdd.setProjectCode(projectCode);
                workerAttendanceAdd.setTeamSysNo(Integer.parseInt(tmpDepts[0].toString()));
                int forLength = 0;
                if (personNum > 10) {
                    if (i == 0) {
                        forLength = 10;
                    } else if ((personNum - (i * 10)) > 10) {
                        forLength = (i + 1) * 10;
                    } else {
                        forLength = personNum;
                    }

                } else {
                    forLength = personNum;
                }
                //内层for循环判断每次几个人
                for (int j = i * 10; j < forLength; j++) {
                    WorkerAttendanceAddDto.DataList dataList = new WorkerAttendanceAddDto.DataList();
                    dataList.setIdCardType(persons.get(j).getIdCardType());
                    dataList.setIdCardNumber(AesUtils.encrypt(persons.get(j).getIdCardNumber(), String.valueOf(appSecret)));
                    dataList.setDate(persons.get(j).getDate());
                    dataList.setDirection(persons.get(j).getDirection());
                    listData.add(dataList);
                }
                workerAttendanceAdd.setDataList(listData);
                PlantUtil plantUtil = PlantUtil.getInstance();
                String rst = plantUtil.method("WorkerAttendance.Add").appId(appid).appsecret(appSecret).data(workerAttendanceAdd).excute();
                Gson gson = new Gson();
                dto = gson.fromJson(rst, ReseponseDTO.class);
                logger.info("当前时间是：{}",new Date());
                logger.info("国家平台上传返回值：{}",dto.toString());
                if (dto.getCode() == 0) {
                    ReseponseDTO.Data data1 = dto.getData();
                    //条用异步查询方法
                    PlantResultDTO.Data Ajaxresult = plantUtil.AjaxRequest(data1, appid);
                    //判断异步请求的返回状态
                    if (Ajaxresult.getStatus() == 20 || Ajaxresult.getStatus() == 0) {
                        // 如果成功的话就更新人员考勤数据为已上传
                        for (WorkerAttendanceDTO person:persons){
                            recordRepository.updateResult(person.getIdCardNumber(),person.getDate());
                        }
                        logger.info("当前时间是：{}",new Date());
                        logger.info("成功的国家平台异步请求返回值：{}",Ajaxresult.toString());
                    } else {
                        logger.info("当前时间是：{}",new Date());
                        logger.info("失败的国家平台异步请求返回值：{}",Ajaxresult.toString());
                    }
                }
            }

        }
    }


//    @Scheduled(cron = "* * * * * ?")
//    public void test(){
//        logger.info("当前时间是：{}",new Date());
//        logger.error("当前时间是：{}",new Date());
//        logger.warn("当前时间是：{}",new Date());
//    }
}
