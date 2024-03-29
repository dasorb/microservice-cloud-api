package com.dasorb.framework.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy    // 开启API网关服务
@EnableEurekaClient
public class FrameworkGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkGatewayApplication.class, args);
    }

}
