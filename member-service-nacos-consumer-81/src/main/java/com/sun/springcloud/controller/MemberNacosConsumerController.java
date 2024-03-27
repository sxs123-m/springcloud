package com.sun.springcloud.controller;

import com.sun.springcloud.entity.Member;
import com.sun.springcloud.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 孙显圣
 * @version 1.0
 * @Description: 远程调用MemberController的控制器
 */
@RestController // controller注解跟要调用的服务的controller一样
@Slf4j
public class MemberNacosConsumerController {
    // 注入restTemplate 进行远程调用
    @Resource
    private RestTemplate restTemplate;

    // 声明服务发现的前缀
    // 服务发现的的是ip+端口+上下文路径
    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://member-service-nacos-provider";

    // 远程调用MemberController的save方法
    @PostMapping("/member/nacos/consumer/save")
    public Result save(@RequestBody Member member) {
        // 远程调用member-service-nacos-provider的save方法
        return restTemplate.postForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/save", member, Result.class);
    }

    @GetMapping("/member/nacos/consumer/get/{id}") // 这里使用的路径参数
    public Result getMemberById(@PathVariable("id") Long id) {
        // 远程调用member-service-nacos-provider的getMemberById方法
        return restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/get/" + id, Result.class);
    }
}
