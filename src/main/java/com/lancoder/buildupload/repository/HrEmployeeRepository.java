package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.HrEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrEmployeeRepository extends JpaRepository<HrEmployee,Long> {
}
