package com.itmk.web.wxapi.entity;

import lombok.Data;

/**
 * @author java实战基地
 * @since 2383404558
 */
@Data
public class DoctorPage {
    private Integer deptId;
    //当前第几页
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
}
