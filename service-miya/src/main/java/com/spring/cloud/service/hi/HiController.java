package com.spring.cloud.service.hi;

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
    private  static final Logger LOG=Logger.getLogger(HiController.class);
    @Autowired
    private HiServiceI hiServiceI;
    @RequestMapping("/miya")
    public String info(String name){
        LOG.log(Level.INFO, "info is being called");
       // hiServiceI.hi(name);
        return "success";
    }
    @RequestMapping("/test")
    public String test(String name){
        LOG.log(Level.INFO, "info is being called");
        hiServiceI.hi(name);
        return "success";
    }

}
