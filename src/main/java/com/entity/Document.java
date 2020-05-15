package com.entity;

import java.io.Serializable;

/**
 * (Document)实体类
 *
 * @author makejava
 * @since 2020-05-15 01:27:15
 */
public class Document implements Serializable {
    private static final long serialVersionUID = -56307148681908394L;
    
    private Integer id;
    
    private String title;
    
    private String filename;
    
    private Object createtime;
    
    private Integer userid;


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

    public Object getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Object createtime) {
        this.createtime = createtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}