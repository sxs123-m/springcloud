package com.sun.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description: 配置类
 *
 * @Author sun
 * @Create 2024/3/24 14:32
 * @Version 1.0
 */
@Configuration
public class CustomizationBean {
    /**
     * 注入RestTemplate的bean对象
     * @return
     */
    @Bean
    @LoadBalanced // 负载均衡，默认使用轮询算法
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
