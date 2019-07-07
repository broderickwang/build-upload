package com.lancoder.buildupload.service.impl;

import com.lancoder.buildupload.entity.UpConfig;
import com.lancoder.buildupload.repository.UpConfigRepository;
import com.lancoder.buildupload.service.UploadConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UploadConfigServiceImpl implements UploadConfigService {

    @Autowired
    UpConfigRepository upConfigRepository;


    @Override
    public List<UpConfig> findAppid() {
        return upConfigRepository.findAll();
    }
}
