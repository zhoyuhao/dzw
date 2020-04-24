package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("workergroup")
public class lcworkergroupVo {
	@TableId(value = "bzId" ,type = IdType.AUTO)//自动增长列
	private Integer bzId;
	private String bzname;

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

	@Override
	public String toString() {
		return "lcworkergroupVo [bzId=" + bzId + ", bzname=" + bzname + "]";
	}
	public lcworkergroupVo(Integer bzId, String bzname, String hmoney, String type) {
		super();
		this.bzId = bzId;
		this.bzname = bzname;
	}
	public lcworkergroupVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
