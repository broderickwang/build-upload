package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project: build-upload
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2019-07-05
 * @Description:
 * @Copyright: 2019 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value =  "SELECT * FROM employees WHERE EMAIL_ADDRESS like ?1",nativeQuery = true)
    List<Employee> findByTestValue(String addr);
}
