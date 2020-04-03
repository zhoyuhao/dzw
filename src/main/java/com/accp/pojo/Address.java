package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("address")
public class Address {
    @TableId(type = IdType.AUTO,value = "aid")
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