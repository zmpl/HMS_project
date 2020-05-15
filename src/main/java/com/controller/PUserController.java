package com.controller;

import com.entity.PUser;
import com.service.PUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PUser)表控制层
 *
 * @author makejava
 * @since 2020-05-15 01:29:14
 */
@RestController
@RequestMapping("pUser")
public class PUserController {
    /**
     * 服务对象
     */
    @Resource
    private PUserService pUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PUser selectOne(Integer id) {
        return this.pUserService.queryById(id);
    }

}