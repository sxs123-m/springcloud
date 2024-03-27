package com.sun.springcloud.service;

import com.sun.springcloud.entity.Member;

/**
 * Description: 对member表进行操作的service
 *
 * @Author sun
 * @Create 2024/3/23 22:02
 * @Version 1.0
 */
public interface MemberService {
    /**
     * 根据id获取一条记录
     *
     * @param id
     * @return 成功返回member对象，失败返回null
     */
    public Member queryMemberById(Long id);


    /**
     * 保存一条记录
     *
     * @param member
     * @return 成功返回1，失败返回0
     */
    public int save(Member member);

}
