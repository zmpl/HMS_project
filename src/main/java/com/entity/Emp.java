package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2020-05-18 11:28:53
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = -21182720179984480L;
    
    private Integer id;
    
    private String name;
    
    private String sex;
    
    private String phone;
    
    private String email;
    
    private String education;
    
    private String cardNo;
    
    private String address;
    
    private Date createTime;
    
    private Date birthday;
    
    private String hobby;
    
    private Integer jobId;
    
    private Integer deptId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", birthday=" + birthday +
                ", hobby='" + hobby + '\'' +
                ", jobId=" + jobId +
                ", deptId=" + deptId +
                '}';
    }
}