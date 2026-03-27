package com.itmk.web.sys_role.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.sys_role.entity.SysRole;

/**
 * @Author java实战基地
 * @Version 2383404558
 */
public interface SysRoleService extends IService<SysRole> {
    //删除角色
    void delete(Long roleId);
}
