package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("post")
public class lcpostVo {
	@TableId(value = "pid",type = IdType.AUTO)//自动增长列
	private String gwid;
	private String pid;
	private String gwname;
	public String getGwid() {
		return gwid;
	}
	public void setGwid(String gwid) {
		this.gwid = gwid;
	}
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getGwname() {
		return gwname;
	}
	public void setGwname(String gwname) {
		this.gwname = gwname;
	}
	@Override
	public String toString() {
		return "lcpostVo [gwid=" + gwid + ", pid=" + pid + ", gwname=" + gwname + "]";
	}
	
	public lcpostVo(String gwid, String pid, String gwname) {
		super();
		this.gwid = gwid;
		this.pid = pid;
		this.gwname = gwname;
	}
	public lcpostVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
