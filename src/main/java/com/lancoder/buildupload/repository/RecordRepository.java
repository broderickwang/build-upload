package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.dto.WorkerAttendanceDTO;
import com.lancoder.buildupload.entity.MjRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<MjRecord,Long> {

    @Query(value = "select he.ID_Num as id_card_number,mr.recTime as date,mr.Reader as direction,mr.DoorName as channel " +
            "from MJ_Record mr left join HR_Employee he on he.AccountID=mr.AccountID where (he.ID_Num is not null and he.ID_Num != '') and he.Dep_ID=?1 and CONVERT(varchar(100), mr.RecTime, 112) = ?2 ",nativeQuery = true)
    List<Object> getAllRecord(long deptId,String time);

    @Query(value = "select he.ID_Num as idCardNumber,mr.recTime as date,mr.Reader as direction,mr.DoorName as channel " +
            "from MJ_Record mr left join HR_Employee he on he.AccountID=mr.AccountID where (he.ID_Num is not null and he.ID_Num != '') and he.Dep_ID=?1  ",nativeQuery = true)
    List<WorkerAttendanceDTO> findAllWorkers(long deptId);

    public interface WorkerAttendanceDTO{
        public String getIdCardNumber();

        public String getDate();

        public String getDirection();

        public String getChannel();
    }
}
