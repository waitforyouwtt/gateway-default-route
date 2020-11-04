package com.yidiandian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PointsMallServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointsMallServiceApplication.class, args);
    }

}
