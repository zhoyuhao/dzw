package com.accp.demo.pojo;

public class Post {
    private Integer gwid;

    private String pid;

    private String gwname;

    public Integer getGwid() {
        return gwid;
    }

    public void setGwid(Integer gwid) {
        this.gwid = gwid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getGwname() {
        return gwname;
    }

    public void setGwname(String gwname) {
        this.gwname = gwname == null ? null : gwname.trim();
    }
}