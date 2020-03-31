package com.accp.demo.pojo;

public class Userphone {
    private Integer txlid;

    private String pid;

    private String txlname;

    private String txlphone;

    public Integer getTxlid() {
        return txlid;
    }

    public void setTxlid(Integer txlid) {
        this.txlid = txlid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getTxlname() {
        return txlname;
    }

    public void setTxlname(String txlname) {
        this.txlname = txlname == null ? null : txlname.trim();
    }

    public String getTxlphone() {
        return txlphone;
    }

    public void setTxlphone(String txlphone) {
        this.txlphone = txlphone == null ? null : txlphone.trim();
    }
}