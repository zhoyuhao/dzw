package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("engine")
public class Eengine {
	
	@TableId(type = IdType.AUTO,value = "eid")
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