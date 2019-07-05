package com.lancoder.buildupload.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @project: build-upload
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2019-07-05
 * @Description:
 * @Copyright: 2019 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
