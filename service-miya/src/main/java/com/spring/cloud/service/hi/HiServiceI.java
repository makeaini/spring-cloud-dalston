package com.spring.cloud.service.hi;

/**
 * Created by shining on 2017-09-22.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient("service-hi")
public interface HiServiceI {
        @GetMapping("/test")
        String hi(@RequestParam(name = "name",required = false) String name);
}
