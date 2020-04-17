package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("role")
public class lcrolevo {
	@TableId(value = "cid" ,type = IdType.AUTO)//自动增长列
	private Integer cid;
	private String cname;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "lcrolevo [cid=" + cid + ", cname=" + cname + "]";
	}
	public lcrolevo(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public lcrolevo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
