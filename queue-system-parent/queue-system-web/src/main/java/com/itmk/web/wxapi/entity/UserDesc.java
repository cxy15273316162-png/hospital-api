package com.itmk.web.wxapi.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author java实战基地
 * @since 2383404558
 */
@Data
public class UserDesc {
    private String nickName;
    private String sex;
    private String jobTitle;
    private String image;
    private Long userId;
    private String deptName;
    private String visitAddress;
    //擅长治疗的病症
    private String goodAt;
    //挂号费
    private BigDecimal price;
    //简介
    private String introduction;
}
