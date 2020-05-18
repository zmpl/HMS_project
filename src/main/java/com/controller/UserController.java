package com.controller;

import com.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-18 14:24:27
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    @ResponseBody
    public String selectOne(Integer id) throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(this.userService.queryById(id));
    }

    /**
     * 通过账号密码登录
     * @param loginName 登录名
     * @param password 密码
     * @return 登录的帐户
     */
    @RequestMapping(value = "login",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login(@RequestParam("loginName") String loginName,@RequestParam("password") String password,HttpSession session) throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        User user=this.userService.login(loginName,password);
        session.setAttribute("login_user",user);
        String resultStr=objectMapper.writeValueAsString(user);
        return resultStr;
    }
}