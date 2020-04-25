package com.accp.pojo;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("goods")
public class Goods {
    
    @TableId(type = IdType.AUTO,value = "gid")
    private Integer gid;

    private Integer ghsid;

    private String gname;

    private Date gtime;

    private Float gprice;

    private String gbrand;

    private String gsuitable;

    private String gtype;

    private String gdescribe;

    private Integer gnumber;
    
    private Integer type;
    
   

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getGhsid() {
        return ghsid;
    }

    public void setGhsid(Integer ghsid) {
        this.ghsid = ghsid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
    }

    public Float getGprice() {
        return gprice;
    }

    public void setGprice(Float gprice) {
        this.gprice = gprice;
    }

    public String getGbrand() {
        return gbrand;
    }

    public void setGbrand(String gbrand) {
        this.gbrand = gbrand == null ? null : gbrand.trim();
    }

    public String getGsuitable() {
        return gsuitable;
    }

    public void setGsuitable(String gsuitable) {
        this.gsuitable = gsuitable == null ? null : gsuitable.trim();
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    public String getGdescribe() {
        return gdescribe;
    }

    public void setGdescribe(String gdescribe) {
        this.gdescribe = gdescribe == null ? null : gdescribe.trim();
    }

    public Integer getGnumber() {
        return gnumber;
    }

    public void setGnumber(Integer gnumber) {
        this.gnumber = gnumber;
    }
    
    
}