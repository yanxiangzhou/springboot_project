package com.baidu.springboot.response.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @author zhangsan
 * @name User
 * @date 2025-05-10 20:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String name;

}
