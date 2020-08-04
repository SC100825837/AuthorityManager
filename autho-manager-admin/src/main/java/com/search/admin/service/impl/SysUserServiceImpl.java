package com.search.admin.service.impl;

import com.search.admin.mapper.SysUserMapper;
import com.search.admin.model.SysUser;
import com.search.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: AuthorityManager
 * @description:
 * @author: SunChao
 * @create: 2020-08-04 14:50
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
