package com.sun.springcloud.service;

import com.sun.springcloud.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description: 使用@FeignClient注解进行服务发现，并准备好要远程调用的方法
 *
 * @Author sun
 * @Create 2024/3/25 15:49
 * @Version 1.0
 */
@Component // 注入容器
@FeignClient("MEMBER-SERVICE-PROVIDER") // 消费者进行服务发现找到指定的提供者的http://ip+端口
public interface MemberFeignService {
    /**
     * 要远程调用的方法，直接粘贴过来即可
     * 此时的url = http://MEMBER-SERVICE-PROVIDER/member/get/{id}
     * @param id
     * @return
     */
    @GetMapping("/member/get/{id}") // 这里使用的路径参数
    public Result getMemberById(@PathVariable("id") Long id);
}
