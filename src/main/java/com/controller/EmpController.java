package com.controller;

import com.entity.Emp;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2020-05-18 11:28:53
 */
@Controller
@RequestMapping("emp")
public class EmpController {
    /**
     * 服务对象
     */
    @Autowired
    private EmpService empService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public Emp selectOne(Integer id) {
        return this.empService.queryById(id);
    }

}