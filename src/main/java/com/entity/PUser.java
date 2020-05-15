package com.entity;

import java.io.Serializable;

/**
 * (PUser)实体类
 *
 * @author makejava
 * @since 2020-05-15 01:29:14
 */
public class PUser implements Serializable {
    private static final long serialVersionUID = 344414765702776912L;
    
    private Integer userid;
    
    private String userloginname;
    
    private String userpwd;
    
    private String username;
    
    private Integer userstate;
    
    private Object usercreatetime;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserloginname() {
        return userloginname;
    }

    public void setUserloginname(String userloginname) {
        this.userloginname = userloginname;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public Object getUsercreatetime() {
        return usercreatetime;
    }

    public void setUsercreatetime(Object usercreatetime) {
        this.usercreatetime = usercreatetime;
    }

}