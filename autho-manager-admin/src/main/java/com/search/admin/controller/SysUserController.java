package com.search.admin.controller;

import com.search.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: AuthorityManager
 * @description:
 * @author: SunChao
 * @create: 2020-08-04 14:51
 **/
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}
