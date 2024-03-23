package com.sun.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/23 11:10
 * @Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
//Serializable 加上，后面可能使用
public class Member implements Serializable {
    private Long id;
    private String name;
    private String pwd;
    private String mobile;
    private String email;
    private Integer gender;
}
