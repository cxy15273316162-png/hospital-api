package com.itmk.web.wxapi.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author java实战基地
 * @since 2383404558
 */
@Data
public class DeptTree {
    private String name;
    private List<UserInfo> childrens = new ArrayList<>();
}
