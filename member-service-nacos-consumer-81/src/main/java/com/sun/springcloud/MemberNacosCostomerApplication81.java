package com.sun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 孙显圣
 * @version 1.0
 */
@SpringBootApplication // springboot启动类
@EnableDiscoveryClient // 开启nacos服务发现
public class MemberNacosCostomerApplication81 {
    public static void main(String[] args) {
        SpringApplication.run(MemberNacosCostomerApplication81.class, args);
    }
}
