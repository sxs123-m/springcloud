package com.sun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 获取配置中心的数据
 *
 * @Author sun
 * @Create 2024/3/27 21:27
 * @Version 1.0
 */
@RestController
@RefreshScope
public class NacosConfigController {

    /* 使用Value注解可以获取配置中心中对应于这个微服务集群的配置文件的信息，注意：如果获取不到信息，则微服务直接启动不了 */
    @Value("${config.ip}")
    private String ip;

    @Value("${config.name}")
    private String name;

    @GetMapping("/nacos/config/mes")
    public String getConfigIpAndName() {
        return "ip:" + ip + " name:" + name;
    }
}
