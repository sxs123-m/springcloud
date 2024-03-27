package com.sun.springcloud.dao;

import com.sun.springcloud.entity.Member;
import org.apache.ibatis.annotations.Mapper;


/**
 * Description: 对member表进行操作
 *
 * @Author sun
 * @Create 2024/3/23 21:06
 * @Version 1.0
 */
@Mapper // 注入容器
public interface MemberDao {

    /**
     * 根据id进行查询
     * @param id
     * @return 查询成功返回Member对象，查询失败返回null
     */
    public Member queryMemberById(Long id);

    /**
     * 保存一条记录
     * @param member
     * @return 返回受影响的行数
     */
    public int save(Member member);
}
