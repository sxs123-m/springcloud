package com.sun.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类注入RestTemplate，并且赋予负载均衡的能力
 *
 * @author 孙显圣
 * @version 1.0
 */
@Configuration // 标识这是一个配置类
public class CustomizationBean {
    @Bean
    @LoadBalanced // 赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
