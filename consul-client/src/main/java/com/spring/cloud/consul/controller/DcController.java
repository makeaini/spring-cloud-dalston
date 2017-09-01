package com.spring.cloud.consul.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shining on 2017-08-30.
 */
@RestController
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;
    private static final Logger LOG= LoggerFactory.getLogger(DcController.class);
    @GetMapping("/dc")
    public String  dc(){
        String services = "Services: " + discoveryClient.getServices();
        LOG.info(services);
        return services;
    }
}
