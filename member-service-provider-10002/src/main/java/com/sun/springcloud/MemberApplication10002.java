package com.sun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/22 12:49
 * @Version 1.0
 */
@EnableEurekaClient // 作为客户端启动Eureka
@SpringBootApplication
public class MemberApplication10002 {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication10002.class, args);
    }
}
