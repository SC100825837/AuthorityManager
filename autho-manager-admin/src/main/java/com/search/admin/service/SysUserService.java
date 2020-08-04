package com.search.admin.service;

import com.search.admin.model.SysUser;

import java.util.List;

/**
 * @program: AuthorityManager
 * @description:
 * @author: SunChao
 * @create: 2020-08-04 14:49
 **/
public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}
