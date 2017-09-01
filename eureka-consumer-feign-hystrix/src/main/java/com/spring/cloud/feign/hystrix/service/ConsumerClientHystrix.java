package com.spring.cloud.feign.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * Created by shining on 2017-08-31.
 */
@Component
public class ConsumerClientHystrix implements DcClient{
    @Override
    public String consumer(String name) {
        return "error";
    }
}
