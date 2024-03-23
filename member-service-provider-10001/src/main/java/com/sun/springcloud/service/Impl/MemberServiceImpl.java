package com.sun.springcloud.service.Impl;

import com.sun.springcloud.dao.MemberDao;
import com.sun.springcloud.entity.Member;
import com.sun.springcloud.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description: member表的service实现类
 *
 * @Author sun
 * @Create 2024/3/23 22:05
 * @Version 1.0
 */
@Service // 注入容器
public class MemberServiceImpl implements MemberService {
    @Resource // 依赖注入memberdao
    private MemberDao memberDao;
    @Override
    public Member queryMemberById(Long id) {
        return memberDao.queryMemberById(id);
    }

    @Override
    public int save(Member member) {
        return memberDao.save(member);
    }
}
