package com.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class EurekaConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
	}
}