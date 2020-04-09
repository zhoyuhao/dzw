package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.TableName;


public class lcserviceVo {
	private Integer aa;
	private Integer bb;
	
	private Integer cc;

	

	public Integer getAa() {
		return aa;
	}



	public void setAa(Integer aa) {
		this.aa = aa;
	}
	
	public Integer getBb() {
		return bb;
	}



	public void setBb(Integer bb) {
		this.bb = bb;
	}
	



	
	public Integer getCc() {
		return cc;
	}



	public void setCc(Integer cc) {
		this.cc = cc;
	}



	



	@Override
	public String toString() {
		return "lcserviceVo [aa=" + aa + ", bb=" + bb + ", cc=" + cc + "]";
	}



	



	public lcserviceVo(Integer aa, Integer bb, Integer cc) {
		super();
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}



	public lcserviceVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
