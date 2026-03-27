package com.itmk.web.schedule_detail.entity;
import lombok.Data;

/**
 * @Author java实战基地
 * @Version 2383404558
 */
@Data
public class ScheduleDetailPageParm {
    //当前第几页
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
    //医生姓名
    private String doctorName;
}