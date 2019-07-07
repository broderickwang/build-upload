package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.StProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<StProject,Long> {
    @Query(value = "select projectCode from ST_Project",nativeQuery = true)
    List<Object> getProCode();
}
