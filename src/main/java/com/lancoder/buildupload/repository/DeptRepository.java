package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.HrDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<HrDept,Long> {
}
