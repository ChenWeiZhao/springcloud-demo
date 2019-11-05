package com.imooc.homepage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基本的用户信息
 * @Data 增加getter和settter方法
 * @NoArgsConstructor  无参构造函数
 * @AllArgsConstructor 全参构造函数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private Long id;
    private String username;
    private String email;

    public static UserInfo invalid() {
        return new UserInfo(-1L, "", "");
    }
}
