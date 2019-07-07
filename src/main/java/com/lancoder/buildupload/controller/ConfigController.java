package com.lancoder.buildupload.controller;

import com.lancoder.buildupload.service.UploadConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    UploadConfigService uploadConfigService;

    @GetMapping("all")
    public String all(){
        return uploadConfigService.findAll().toString();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
