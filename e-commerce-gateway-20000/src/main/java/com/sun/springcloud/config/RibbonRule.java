package com.sun.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 配置自己的负载均衡算法
 *
 * @Author sun
 * @Create 2024/3/26 14:31
 * @Version 1.0
 */
@Configuration
public class RibbonRule {
    // @Bean
    // public IRule myRibbonRule() {
    //     return new RandomRule();
    // }
}
