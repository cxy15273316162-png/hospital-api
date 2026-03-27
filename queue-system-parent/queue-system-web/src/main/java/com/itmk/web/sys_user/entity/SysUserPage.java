package com.itmk.web.sys_user.entity;

import lombok.Data;

/**
 * @Author java实战基地
 * @Version 2383404558
 */
@Data
public class SysUserPage {
     private String phone;
     private String nickName;
      //当前第几页
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
}
