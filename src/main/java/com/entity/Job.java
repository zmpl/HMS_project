package com.entity;

import java.io.Serializable;

/**
 * (Job)实体类
 *
 * @author makejava
 * @since 2020-05-15 01:27:38
 */
public class Job implements Serializable {
    private static final long serialVersionUID = 750229418249397211L;
    
    private Integer jobid;
    
    private String jobname;
    
    private String jobinfo;


    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getJobinfo() {
        return jobinfo;
    }

    public void setJobinfo(String jobinfo) {
        this.jobinfo = jobinfo;
    }

}