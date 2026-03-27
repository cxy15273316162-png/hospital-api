package com.itmk.web.sys_user.entity;

import lombok.Data;

/**
 * 返回用户的信息
 * @Author java实战基地
 * @Version 2383404558
 */
@Data
public class UserInfo {
    private Long userId;
    private String name;
    private Object[] permissons;
}
