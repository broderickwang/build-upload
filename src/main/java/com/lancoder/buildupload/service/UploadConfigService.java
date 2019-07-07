package com.lancoder.buildupload.service;

import com.lancoder.buildupload.entity.UpConfig;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UploadConfigService {
    List<UpConfig> findAppid();
}
