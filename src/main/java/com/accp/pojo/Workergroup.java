package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("workergroup")
public class Workergroup {
    @TableId(type = IdType.AUTO,value = "bzid")
    private Integer bzid;

    private String bzname;
    
    private Float hmoney;
    
    private Integer type;

    
    public Float getHmoney() {
		return hmoney;
	}

	public void setHmoney(Float hmoney) {
		this.hmoney = hmoney;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getBzid() {
        return bzid;
    }

    public void setBzid(Integer bzid) {
        this.bzid = bzid;
    }

    public String getBzname() {
        return bzname;
    }

    public void setBzname(String bzname) {
        this.bzname = bzname == null ? null : bzname.trim();
    }
}