package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.HrDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptRepository extends JpaRepository<HrDept,Long> {
    @Query(value = "select teamSysNo,Dep_Id from HR_Dept ",nativeQuery = true)
    List<Object> getDeptInfo();

}
