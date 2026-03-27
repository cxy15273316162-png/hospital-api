package com.itmk.web.wxapi.entity;

import lombok.Data;

/**
 * @author java实战基地
 * @since 2383404558
 */
@Data
public class UpdatePasswordParm {
    private Integer userId;
    private String oldPassword;
    private String password;
}
