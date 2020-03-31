package com.accp.pojo;

import java.util.Date;

public class Service {
    private String wid;

    private String wname;

    private String wtype;

    private String wjname;

    private String wcarid;

    private String wphone;

    private String wvipid;

    private Integer wstatic;

    private Integer wsumprice;

    private Integer wleixi;

    private Date wstatdate;

    private Date wenddate;

    private Integer wpayment;

    private Date paymenttirm;

    private Float decide;

    private Float deductionmoney;

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype == null ? null : wtype.trim();
    }

    public String getWjname() {
        return wjname;
    }

    public void setWjname(String wjname) {
        this.wjname = wjname == null ? null : wjname.trim();
    }

    public String getWcarid() {
        return wcarid;
    }

    public void setWcarid(String wcarid) {
        this.wcarid = wcarid == null ? null : wcarid.trim();
    }

    public String getWphone() {
        return wphone;
    }

    public void setWphone(String wphone) {
        this.wphone = wphone == null ? null : wphone.trim();
    }

    public String getWvipid() {
        return wvipid;
    }

    public void setWvipid(String wvipid) {
        this.wvipid = wvipid == null ? null : wvipid.trim();
    }

    public Integer getWstatic() {
        return wstatic;
    }

    public void setWstatic(Integer wstatic) {
        this.wstatic = wstatic;
    }

    public Integer getWsumprice() {
        return wsumprice;
    }

    public void setWsumprice(Integer wsumprice) {
        this.wsumprice = wsumprice;
    }

    public Integer getWleixi() {
        return wleixi;
    }

    public void setWleixi(Integer wleixi) {
        this.wleixi = wleixi;
    }

    public Date getWstatdate() {
        return wstatdate;
    }

    public void setWstatdate(Date wstatdate) {
        this.wstatdate = wstatdate;
    }

    public Date getWenddate() {
        return wenddate;
    }

    public void setWenddate(Date wenddate) {
        this.wenddate = wenddate;
    }

    public Integer getWpayment() {
        return wpayment;
    }

    public void setWpayment(Integer wpayment) {
        this.wpayment = wpayment;
    }

    public Date getPaymenttirm() {
        return paymenttirm;
    }

    public void setPaymenttirm(Date paymenttirm) {
        this.paymenttirm = paymenttirm;
    }

    public Float getDecide() {
        return decide;
    }

    public void setDecide(Float decide) {
        this.decide = decide;
    }

    public Float getDeductionmoney() {
        return deductionmoney;
    }

    public void setDeductionmoney(Float deductionmoney) {
        this.deductionmoney = deductionmoney;
    }
}