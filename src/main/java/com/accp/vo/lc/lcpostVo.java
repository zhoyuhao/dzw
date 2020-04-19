package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("post")
public class lcpostVo {
	@TableId(value = "pid",type = IdType.AUTO)//自动增长列
	private String gwid;
	private Integer pid;
	private String gwname;
	public String getGwid() {
		return gwid;
	}
	public void setGwid(String gwid) {
		this.gwid = gwid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getGwname() {
		return gwname;
	}
	public void setGwname(String gwname) {
		this.gwname = gwname;
	}
	

}
