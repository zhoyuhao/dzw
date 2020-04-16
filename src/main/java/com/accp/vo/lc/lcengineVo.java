package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("engine")
public class lcengineVo {
	@TableId(value = "eid")
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
		this.ename = ename;
	}
	public Float getEprice() {
		return eprice;
	}
	public void setEprice(Float eprice) {
		this.eprice = eprice;
	}
	@Override
	public String toString() {
		return "lcengineVo [eid=" + eid + ", ename=" + ename + ", eprice=" + eprice + "]";
	}
	public lcengineVo(Integer eid, String ename, Float eprice) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eprice = eprice;
	}
	
	
	
	
	
	

}
