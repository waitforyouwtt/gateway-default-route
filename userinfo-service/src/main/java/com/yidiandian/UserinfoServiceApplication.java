package com.yidiandian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserinfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserinfoServiceApplication.class, args);
    }

}
