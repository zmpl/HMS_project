package com.entity;

import java.io.Serializable;

/**
 * (Notice)实体类
 *
 * @author makejava
 * @since 2020-05-15 01:28:57
 */
public class Notice implements Serializable {
    private static final long serialVersionUID = -58184287490088316L;
    
    private Integer noticeid;
    
    private String title;
    
    private String content;
    
    private Object createtime;
    
    private Integer userid;


    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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