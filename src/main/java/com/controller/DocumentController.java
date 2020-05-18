package com.controller;

import com.entity.Document;
import com.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Document)表控制层
 *
 * @author makejava
 * @since 2020-05-18 11:28:53
 */
@Controller
@RequestMapping("document")
public class DocumentController {
    /**
     * 服务对象
     */
    @Autowired
    private DocumentService documentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public Document selectOne(Integer id) {
        return this.documentService.queryById(id);
    }

}