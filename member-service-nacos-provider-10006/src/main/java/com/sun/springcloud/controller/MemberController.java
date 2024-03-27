package com.sun.springcloud.controller;

import com.sun.springcloud.entity.Member;
import com.sun.springcloud.service.MemberService;
import com.sun.springcloud.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Description: member表的控制器
 *
 * @Author sun
 * @Create 2024/3/23 22:24
 * @Version 1.0
 */
@RestController
@Slf4j
public class MemberController {
    @Resource // 注入service
    private MemberService memberService;

    /**
     * 根据前端传进来的json数据插入一条记录
     *
     * @param member json类型的member对象数据
     * @return 返回json类型的响应
     */
    @PostMapping("/member/save")
    public Result save(@RequestBody Member member) {
        int save = memberService.save(member);
        if (save > 0) {
            return Result.success("添加会员成功！member-service-nacos-provider-10006", save);
        } else {
            return Result.error("401", "添加会员失败");
        }
    }

    /**
     * 根据id来获取某个会员的信息
     *
     * @param id 使用路径参数的形式传入参数
     * @return 返回json格式的数据
     */
    @GetMapping("/member/get/{id}") // 这里使用的路径参数
    public Result getMemberById(@PathVariable("id") Long id) {
        Member member = memberService.queryMemberById(id);

        if (member != null) {
            return Result.success("查询成功！member-service-nacos-provider-10006", member);
        } else {
            return Result.error("402", "ID= " + id + "不存在");
        }
    }
}
