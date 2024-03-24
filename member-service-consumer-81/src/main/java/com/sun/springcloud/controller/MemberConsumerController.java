package com.sun.springcloud.controller;

import com.sun.springcloud.entity.Member;
import com.sun.springcloud.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Description: 作为会员中心微服务对member表操作的网关
 *
 * @Author sun
 * @Create 2024/3/24 14:42
 * @Version 1.0
 */
@RestController
public class MemberConsumerController {
    /*
    访问会员中心微服务的前缀
     */
    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://localhost:10001";
    /*
    注入微服务之间通讯的RestTemplate的bean对象
     */
    @Resource
    private RestTemplate restTemplate;

    /**
     * 向会员中心微服务的save接口发送请求，携带member对象，接受返回的结果Result并以json的格式返回给浏览器
     *
     * @param member 这里的参数必须是表单类型的，因为没有加@requestBody
     * @return
     */
    @PostMapping("/member/consumer/save")
    public Result save(Member member) {
        // 注意：使用restTemplate发送请求时会将member转化为json格式的数据然后再发送请求，所以会员中心微服务的save接口必须加@requestBody注解
        return restTemplate.postForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/save", member, Result.class);
    }

    /**
     * 接受id为路径参数，向会员中心微服务模块的getMemberById接口发送请求，根据id获取信息
     *
     * @param id 请求参数
     * @return 根据id返回json类型的数据
     */
    @GetMapping("/member/consumer/get/{id}") // 这里使用的路径参数
    public Result getMemberById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/get/" + id, Result.class);
    }

}
