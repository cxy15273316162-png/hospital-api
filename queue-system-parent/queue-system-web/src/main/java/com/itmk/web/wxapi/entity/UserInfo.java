package com.itmk.web.wxapi.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author java实战基地
 * @since 2383404558
 */
@Data
public class UserInfo {
    private String name;
    private List<UserDesc> desc = new ArrayList<>();
}
