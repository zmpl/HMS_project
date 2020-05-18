package com.controller;

import com.entity.Notice;
import com.service.NoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Notice)表控制层
 *
 * @author makejava
 * @since 2020-05-18 11:28:53
 */
@RestController
@RequestMapping("notice")
public class NoticeController {
    /**
     * 服务对象
     */
    @Resource
    private NoticeService noticeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Notice selectOne( id) {
        return this.noticeService.queryById(id);
    }

}