package com.lancoder.buildupload.repository;

import com.lancoder.buildupload.entity.StProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<StProject,Long> {
}
