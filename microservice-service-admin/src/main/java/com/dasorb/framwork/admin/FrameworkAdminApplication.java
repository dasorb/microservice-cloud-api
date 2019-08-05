package com.dasorb.framwork.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrameworkAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkAdminApplication.class, args);
    }

}
