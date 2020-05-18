package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-18 14:24:27
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    /**
     * 通过账号密码登录
     * @param loginName 登录名
     * @param password 密码
     * @return 登录的帐户
     */
    @RequestMapping("login")
    public User login(String loginName,String password){
        return this.userService.login(loginName,password);
    }
}