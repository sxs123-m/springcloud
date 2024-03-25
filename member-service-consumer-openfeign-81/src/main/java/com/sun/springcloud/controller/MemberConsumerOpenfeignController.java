package com.sun.springcloud.controller;

import com.sun.springcloud.service.MemberFeignService;
import com.sun.springcloud.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description: 注入MemberFeignService的代理对象，使用代理对象进行远程调用
 *
 * @Author sun
 * @Create 2024/3/25 15:55
 * @Version 1.0
 */
@RestController
public class MemberConsumerOpenfeignController {
    /*
    注入一个针对接口MemberFeignService的代理对象，使用这个代理对象可以直接远程调用服务发现的方法
     */
    @Resource
    private MemberFeignService memberFeignService;

    @GetMapping("/member/get/{id}") // 这里使用的路径参数
    public Result getMemberById(@PathVariable("id") Long id) {
        return memberFeignService.getMemberById(id);
    }

}
