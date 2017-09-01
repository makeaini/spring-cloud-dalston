package com.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shining on 2017-08-30.
 */
@RestController
public class TestController {
    @Value("${info.profile}")
    private String value;
    @GetMapping("value")
    public String home(){
        return value;
    }
}
