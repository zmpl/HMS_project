package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Document)实体类
 *
 * @author makejava
 * @since 2020-05-18 11:28:53
 */
public class Document implements Serializable {
    private static final long serialVersionUID = -15028025229585765L;
    
    private Integer id;
    
    private String title;
    
    private String filename;
    
    private Date createTime;
    
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}