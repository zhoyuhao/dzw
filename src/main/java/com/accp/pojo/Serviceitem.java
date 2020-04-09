package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("serviceitem")
public class Serviceitem {
    
    @TableId(type = IdType.AUTO,value = "xmid")
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