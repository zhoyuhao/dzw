package com.accp.pojo;

public class Serviceitem {
    private Integer xmid;

    private String xnames;

    public Integer getXmid() {
        return xmid;
    }

    public void setXmid(Integer xmid) {
        this.xmid = xmid;
    }

    public String getXnames() {
        return xnames;
    }

    public void setXnames(String xnames) {
        this.xnames = xnames == null ? null : xnames.trim();
    }
}