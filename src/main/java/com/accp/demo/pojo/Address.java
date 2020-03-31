package com.accp.demo.pojo;

public class Address {
    private Integer aid;

    private String ghsaddress;

    private Integer afid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getGhsaddress() {
        return ghsaddress;
    }

    public void setGhsaddress(String ghsaddress) {
        this.ghsaddress = ghsaddress == null ? null : ghsaddress.trim();
    }

    public Integer getAfid() {
        return afid;
    }

    public void setAfid(Integer afid) {
        this.afid = afid;
    }
}