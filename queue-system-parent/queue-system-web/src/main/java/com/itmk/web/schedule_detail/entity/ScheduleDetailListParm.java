package com.itmk.web.schedule_detail.entity;

import lombok.Data;

/**
 * @author java实战基地
 * @since 2383404558
 */
@Data
public class ScheduleDetailListParm {
    //当前第几页
    private Long currentPage;
    //查询的条数
    private Long pageSize;
    //根据名称搜索
    private String doctorName;
}
