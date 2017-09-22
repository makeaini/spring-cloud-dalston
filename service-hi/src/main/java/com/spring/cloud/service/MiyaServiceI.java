package com.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shining on 2017-09-22.
 */
@FeignClient("service-miya")
public interface MiyaServiceI {
    @GetMapping("/miya")
    String miya(@RequestParam(name = "name",required = false) String name);
}
