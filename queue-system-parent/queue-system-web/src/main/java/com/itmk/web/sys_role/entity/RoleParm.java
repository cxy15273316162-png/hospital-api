package com.itmk.web.sys_role.entity;

import lombok.Data;

/**
 * @Author java实战基地
 * @Version 2383404558
 */
@Data
public class RoleParm {
    //当前第几页
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
    //角色名称
    private String roleName;
}