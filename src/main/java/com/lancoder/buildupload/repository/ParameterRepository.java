package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.StParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepository extends JpaRepository<StParameter,Long> {
}
