package com.sun.springcloud;

import com.sun.springcloud.config.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/24 13:58
 * @Version 1.0
 */
@EnableDiscoveryClient // 启动服务发现
@EnableEurekaClient // 作为eureka客户端启动
@RibbonClient(name = "MEMBER_SERVICE_PROVIDER_URL", configuration = RibbonRule.class) // name随便填，configuration是配置文件的Class对象
@SpringBootApplication
public class MemberConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberConsumerApplication.class, args);
    }
}
