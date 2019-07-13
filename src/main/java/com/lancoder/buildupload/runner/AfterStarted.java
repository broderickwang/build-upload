package com.lancoder.buildupload.runner;

import com.lancoder.buildupload.recordUpload.RecordUpload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @project: build-upload
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2019-07-13
 * @Description:
 * @Copyright: 2019 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@Component
public class AfterStarted implements ApplicationRunner {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    RecordUpload recordUpload;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //程序启动后会调用该方法
        logger.info("程序启动成功，调用数据上传接口");
        recordUpload.getToken();
    }
}
