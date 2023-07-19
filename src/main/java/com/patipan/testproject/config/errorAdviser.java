package com.patipan.testproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class errorAdviser {

    @Autowired
    responseObject res;

    @ExceptionHandler(baseException.class)
    public ResponseEntity<responseObject> handleException(baseException e) {
        res.setStatus(Integer.parseInt(String.valueOf(HttpStatus.EXPECTATION_FAILED)));
        res.setMessage(e.getMessage());
        return new ResponseEntity<>(res, HttpStatus.EXPECTATION_FAILED);
    }
}
