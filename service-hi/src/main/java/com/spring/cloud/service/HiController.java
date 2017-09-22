package com.spring.cloud.service;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shining on 2017-09-22.
 */
@RestController
public class HiController {
    @Autowired
    private MiyaServiceI miyaServiceI;
    private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());
    @RequestMapping("hi")
    public String hi(String name){
        LOG.log(Level.INFO, "name service-hi  ");
        return miyaServiceI.miya(name);
    }
    @RequestMapping("test")
    public String test(String name){
        LOG.log(Level.INFO, "name service-test  ");
        return "success";
    }

}
