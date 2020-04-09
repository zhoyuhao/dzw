package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("workergroup")
public class lcworkergroupVo {
	@TableId(value = "bzId" ,type = IdType.AUTO)//自动增长列
	private Integer bzId;
	private String bzname;
	private String hmoney;
	private String type;
	public Integer getBzId() {
		return bzId;
	}
	public void setBzId(Integer bzId) {
		this.bzId = bzId;
	}
	public String getBzname() {
		return bzname;
	}
	public void setBzname(String bzname) {
		this.bzname = bzname;
	}
	public String getHmoney() {
		return hmoney;
	}
	public void setHmoney(String hmoney) {
		this.hmoney = hmoney;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "lcworkergroupVo [bzId=" + bzId + ", bzname=" + bzname + ", hmoney=" + hmoney + ", type=" + type + "]";
	}
	public lcworkergroupVo(Integer bzId, String bzname, String hmoney, String type) {
		super();
		this.bzId = bzId;
		this.bzname = bzname;
		this.hmoney = hmoney;
		this.type = type;
	}
	public lcworkergroupVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
