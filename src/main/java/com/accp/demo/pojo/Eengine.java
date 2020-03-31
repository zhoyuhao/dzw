package com.accp.demo.pojo;

public class Eengine {
    private Integer eid;

    private String ename;

    private Float eprice;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Float getEprice() {
        return eprice;
    }

    public void setEprice(Float eprice) {
        this.eprice = eprice;
    }
}