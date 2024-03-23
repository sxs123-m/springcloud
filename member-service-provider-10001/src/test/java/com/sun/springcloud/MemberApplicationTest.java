package com.sun.springcloud;

import com.sun.springcloud.dao.MemberDao;
import com.sun.springcloud.entity.Member;
import com.sun.springcloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/23 21:46
 * @Version 1.0
 */
@SpringBootTest
@Slf4j
public class MemberApplicationTest {
    @Resource
    private MemberDao memberDao;
    @Resource
    private MemberService memberService;

    @Test
    public void queryMemberById() {
        Member member = memberDao.queryMemberById(1L);
        log.info("member={}", member);
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("sun");
        member.setPwd("12121");
        member.setMobile("2342343");
        member.setEmail("123@qq.com");
        member.setGender(0);

        int save = memberDao.save(member);
        Assert.assertEquals(1, save);
    }

    @Test
    public void queryMemberById2() {
        Member member = memberService.queryMemberById(1L);
        log.info("member={}", member);
    }

    @Test
    public void save2() {
        Member member = new Member();
        member.setName("sun");
        member.setPwd("12121");
        member.setMobile("2342343");
        member.setEmail("123@qq.com");
        member.setGender(0);
        int save = memberService.save(member);
        Assert.assertEquals(1, save);
    }
}













