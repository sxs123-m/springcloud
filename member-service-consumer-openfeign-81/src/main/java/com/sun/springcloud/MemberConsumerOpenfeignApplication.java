package com.sun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/25 15:23
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient // 作为EurekaClient启动
@EnableFeignClients
public class MemberConsumerOpenfeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberConsumerOpenfeignApplication.class, args);
    }
}
