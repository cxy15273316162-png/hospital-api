package com.itmk.web.make_order.entity;
import lombok.Data;

/**
 * @Author java实战基地
 * @Version 2383404558
 */
@Data
public class MakeOrderPageParm {
    //当前第几页
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
    /** 预约人id */
    private Integer userId;
    private Long doctorId;
    private String name;
    private String timesArea;
}