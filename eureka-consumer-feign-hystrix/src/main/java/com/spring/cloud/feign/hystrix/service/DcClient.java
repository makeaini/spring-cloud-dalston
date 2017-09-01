package com.spring.cloud.feign.hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shining on 2017-08-30.
 */
@FeignClient(value = "eureka-client",fallback = ConsumerClientHystrix.class)
public interface DcClient {
    @GetMapping("/dc")
    String consumer(@RequestParam("name") String name);
}