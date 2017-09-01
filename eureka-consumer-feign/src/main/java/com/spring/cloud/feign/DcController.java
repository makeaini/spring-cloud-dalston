package com.spring.cloud.feign;

import com.spring.cloud.feign.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shining on 2017-08-30.
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;
    @GetMapping("/consumer")
    public String dc(String name) {
        return dcClient.consumer(name);
    }
}
