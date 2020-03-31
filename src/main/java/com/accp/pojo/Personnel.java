package com.accp.pojo;

import java.util.Date;

public class Personnel {
    private String pid;

    private Integer bzid;

    private String pname;

    private String psex;

    private String peducational;

    private Date pentry;

    private String pphone;

    private String paddress;

    private String pidcard;

    private Integer pstatic;

    private String ppwd;

    private Integer ppost;


	public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getBzid() {
        return bzid;
    }

    public void setBzid(Integer bzid) {
        this.bzid = bzid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex == null ? null : psex.trim();
    }

    public String getPeducational() {
        return peducational;
    }

    public void setPeducational(String peducational) {
        this.peducational = peducational == null ? null : peducational.trim();
    }

    public Date getPentry() {
        return pentry;
    }

    public void setPentry(Date pentry) {
        this.pentry = pentry;
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone == null ? null : pphone.trim();
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress == null ? null : paddress.trim();
    }

    public String getPidcard() {
        return pidcard;
    }

    public void setPidcard(String pidcard) {
        this.pidcard = pidcard == null ? null : pidcard.trim();
    }

    public Integer getPstatic() {
        return pstatic;
    }

    public void setPstatic(Integer pstatic) {
        this.pstatic = pstatic;
    }

    public String getPpwd() {
        return ppwd;
    }

    public void setPpwd(String ppwd) {
        this.ppwd = ppwd == null ? null : ppwd.trim();
    }

    public Integer getPpost() {
        return ppost;
    }

    public void setPpost(Integer ppost) {
        this.ppost = ppost ;
    }
}