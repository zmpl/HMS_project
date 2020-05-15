package com.entity;

import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2020-05-14 16:22:54
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = -49405450970957689L;
    
    private Integer empid;
    
    private String empname;
    
    private String empsex;
    
    private String empphone;
    
    private String empemail;
    
    private String empeducation;
    
    private String empcardno;
    
    private String empaddress;
    
    private Object empcreatetime;
    
    private Object empbirthday;
    
    private String emphobby;
    
    private Integer jobid;
    
    private Integer deptid;


    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public String getEmpeducation() {
        return empeducation;
    }

    public void setEmpeducation(String empeducation) {
        this.empeducation = empeducation;
    }

    public String getEmpcardno() {
        return empcardno;
    }

    public void setEmpcardno(String empcardno) {
        this.empcardno = empcardno;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public Object getEmpcreatetime() {
        return empcreatetime;
    }

    public void setEmpcreatetime(Object empcreatetime) {
        this.empcreatetime = empcreatetime;
    }

    public Object getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(Object empbirthday) {
        this.empbirthday = empbirthday;
    }

    public String getEmphobby() {
        return emphobby;
    }

    public void setEmphobby(String emphobby) {
        this.emphobby = emphobby;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

}