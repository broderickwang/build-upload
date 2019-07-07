package com.lancoder.buildupload.util;

import com.google.gson.Gson;
import com.lancoder.buildupload.dto.PlantResultDTO;
import com.lancoder.buildupload.dto.ReseponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlantUtil<T> {

    final static Logger logger = LoggerFactory.getLogger(PlantUtil.class);


    private static PlantUtil plantUtil;

    //国家平台测试地址
//    private String url="http://182.148.48.165:8090/open.api";

    //国家平台正式地址
    private String url = "http://jzgr.mohurd.gov.cn:81/open.api";

    private String appId = "";

    private String format = "json";

    private String method = null;

    private String version = "1.0";

    private String appsecret = "";

    private String corpsign = "3e43e64832ea4d298c277e52a96e407e";

    private String data;

    private PlantUtil PlantUtil() {
        return this.plantUtil;
    }

    public static PlantUtil getInstance() {
        if (plantUtil == null) {
            plantUtil = new PlantUtil();
        }
        return plantUtil;
    }

    public PlantUtil url(String url) {
        this.url = url;
        return this;
    }

    /**
     * String sortString = "appid=" + "qg-101734";
     * sortString += "&data=" + data;
     * sortString += "&format=json";
     * sortString += "&method=" + "Corp.Query";
     * sortString += "&nonce=" + guid;
     * sortString += "&timestamp=" + timestamp;
     * sortString += "&version=" + "1.0";
     * sortString += "&appsecret=" + "89291f8295684c5686db10accc67ed2a";
     */
    public PlantUtil appId(String appId) {
        this.appId = appId;
        return this;
    }

    public PlantUtil format(String format) {
        this.format = format;
        return this;
    }

    public PlantUtil method(String method) {
        this.method = method;
        return this;
    }

    public PlantUtil version(String version) {
        this.version = version;
        return this;
    }

    public PlantUtil appsecret(String appsecret) {
        this.appsecret = appsecret;
        return this;
    }

    public PlantUtil data(T data) {
        Gson g = new Gson();
        this.data = g.toJson(data);
        return this;
    }


    public String excute() {
        String rst = "";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String guid = UUID.randomUUID().toString().replace("-", "");
        String timestamp = sdf.format(new Date());
        logger.info("系统时间戳是{}", timestamp);
        String sortString = "appid=" + this.appId;
        sortString += "&data=" + this.data;
        sortString += "&format=json";
        sortString += "&method=" + this.method;
        sortString += "&nonce=" + guid;
        sortString += "&timestamp=" + timestamp;
        sortString += "&version=" + this.version;
        sortString += "&appsecret=" + this.appsecret;
        //        //企业密钥+时间戳用AES加密
        ////        String encrypt = AesUtils.encrypt(this.corpsign + timestamp, this.appsecret);
        ////        sortString += "&corpsign=" + encrypt;
        //        //生成签名
        String sign = EncriptionHelper.getSHA256StrJava(sortString.toLowerCase());

        BaseRequest request = new BaseRequest() {
        };
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("appid", this.appId);
        dataMap.put("data", data);
        dataMap.put("format", this.format);
        dataMap.put("method", this.method);
        dataMap.put("nonce", guid);
        dataMap.put("timestamp", timestamp);
//        dataMap.put("corpsign",encrypt);
        dataMap.put("version", this.version);
        dataMap.put("sign", sign);
        try {
            rst = request.postData(url, null, dataMap);
        } catch (Exception ex) {
            String errorMsg = "";
            if (ex.getMessage().contains("ClientProtocolException")) {
                errorMsg = "异常：输入的URL无效";
            } else if (ex.getMessage().contains("UnknownHostException") || ex.getMessage().contains("unreachable")) {
                errorMsg = "异常：输入的URL不正确";
            }
            System.out.println(errorMsg);
        }
        return rst;
    }

    public PlantResultDTO.Data AjaxRequest(ReseponseDTO.Data dto, String appId) {
        PlantResultDTO.Data result = null;
        PlantResultDTO plantResult = null;
        Gson gson = new Gson();
        //调用异步查看接口
        String requestRes = plantUtil.method("AsyncHandleResult.Query").appId(appId).data(dto).excute();
        plantResult = gson.fromJson(requestRes, PlantResultDTO.class);
        result = plantResult.getData();
        return result;
    }

}
