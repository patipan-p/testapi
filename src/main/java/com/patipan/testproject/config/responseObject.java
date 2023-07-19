package com.patipan.testproject.config;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Data
@Service
public class responseObject {

    private Integer status;

    private String message;

    private ArrayList data;
}
