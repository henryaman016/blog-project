package com.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourcenNotFoundException extends RuntimeException {


    public ResourcenNotFoundException(String message) {
        super(message);
    }
}
