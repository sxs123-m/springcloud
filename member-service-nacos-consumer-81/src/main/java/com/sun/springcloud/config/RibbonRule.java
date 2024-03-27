package com.sun.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 配置类，用于配置Ribbon的负载均衡策略
 * @author 孙显圣
 * @version 1.0
 */
@Configuration
public class RibbonRule {
    @Bean
    public IRule ribbonRule() {
        // 随机策略
        return new RandomRule();
    }
}
