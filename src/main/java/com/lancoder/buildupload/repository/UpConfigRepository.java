package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.Employee;
import com.lancoder.buildupload.entity.UpConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpConfigRepository extends JpaRepository<UpConfig, Long> {
}
