package com.entity;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2020-05-15 01:27:02
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = -91895466728386085L;
    
    private Integer deptid;
    
    private String deptname;
    
    private String deptinfo;


    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptinfo() {
        return deptinfo;
    }

    public void setDeptinfo(String deptinfo) {
        this.deptinfo = deptinfo;
    }

}