package com.accp.vo.lc;

import java.util.Date;

public class lcpersonnelVo {
	private String pId;
	private Integer bzId;
	private String pname;
	private String psex;
	private String peducational;
	private Date pentry;
	private String pphone;
	private String paddress;
	private String pidcard;
	private Integer pstatic;
	private String ppwd;
	private Integer ppost;
	private Integer gwid;
	private String gwname;
	private Integer cid;
	private String cname;
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public Integer getBzId() {
		return bzId;
	}
	public void setBzId(Integer bzId) {
		this.bzId = bzId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	public String getPeducational() {
		return peducational;
	}
	public void setPeducational(String peducational) {
		this.peducational = peducational;
	}
	public Date getPentry() {
		return pentry;
	}
	public void setPentry(Date pentry) {
		this.pentry = pentry;
	}
	public String getPphone() {
		return pphone;
	}
	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPidcard() {
		return pidcard;
	}
	public void setPidcard(String pidcard) {
		this.pidcard = pidcard;
	}
	public Integer getPstatic() {
		return pstatic;
	}
	public void setPstatic(Integer pstatic) {
		this.pstatic = pstatic;
	}
	public String getPpwd() {
		return ppwd;
	}
	public void setPpwd(String ppwd) {
		this.ppwd = ppwd;
	}
	public Integer getPpost() {
		return ppost;
	}
	public void setPpost(Integer ppost) {
		this.ppost = ppost;
	}
	public Integer getGwid() {
		return gwid;
	}
	public void setGwid(Integer gwid) {
		this.gwid = gwid;
	}
	public String getGwname() {
		return gwname;
	}
	public void setGwname(String gwname) {
		this.gwname = gwname;
	}
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
		return "lcpersonnelVo [pId=" + pId + ", bzId=" + bzId + ", pname=" + pname + ", psex=" + psex
				+ ", peducational=" + peducational + ", pentry=" + pentry + ", pphone=" + pphone + ", paddress="
				+ paddress + ", pidcard=" + pidcard + ", pstatic=" + pstatic + ", ppwd=" + ppwd + ", ppost=" + ppost
				+ ", gwid=" + gwid + ", gwname=" + gwname + ", cid=" + cid + ", cname=" + cname + "]";
	}
	public lcpersonnelVo(String pId, Integer bzId, String pname, String psex, String peducational, Date pentry,
			String pphone, String paddress, String pidcard, Integer pstatic, String ppwd, Integer ppost, Integer gwid,
			String gwname, Integer cid, String cname) {
		super();
		this.pId = pId;
		this.bzId = bzId;
		this.pname = pname;
		this.psex = psex;
		this.peducational = peducational;
		this.pentry = pentry;
		this.pphone = pphone;
		this.paddress = paddress;
		this.pidcard = pidcard;
		this.pstatic = pstatic;
		this.ppwd = ppwd;
		this.ppost = ppost;
		this.gwid = gwid;
		this.gwname = gwname;
		this.cid = cid;
		this.cname = cname;
	}
	public lcpersonnelVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	

}
