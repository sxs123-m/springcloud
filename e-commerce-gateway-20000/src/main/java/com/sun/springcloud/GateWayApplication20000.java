package com.sun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 孙显圣
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication20000 {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication20000.class, args);
    }
}
