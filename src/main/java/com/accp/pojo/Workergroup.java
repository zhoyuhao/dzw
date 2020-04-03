package com.accp.pojo;

public class Workergroup {
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