package com.itmk.web.suggest.entity;
import lombok.Data;

/**
 * @Author java实战基地
 * @Version 2383404558
 */
@Data
public class SuggestPageParm {
    //当前第几页
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
    private String name;
}