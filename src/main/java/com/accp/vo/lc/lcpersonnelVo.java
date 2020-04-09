package com.accp.vo.lc;

public class lcpersonnelVo {
	private String pId;
	private Integer bzId;
	private String pname;
	private String psex;
	private String peducational;
	private String pentry;
	private String pphone;
	private String paddress;
	private String pidcard;
	private Integer pstatic;
	private String ppwd;
	private Integer ppost;
	private String gangwei;
	private String juesename;
	private Integer jid;
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
	public String getPentry() {
		return pentry;
	}
	public void setPentry(String pentry) {
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
	public String getGangwei() {
		return gangwei;
	}
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	public String getJuesename() {
		return juesename;
	}
	public void setJuesename(String juesename) {
		this.juesename = juesename;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public lcpersonnelVo(String pId, Integer bzId, String pname, String psex, String peducational, String pentry,
			String pphone, String paddress, String pidcard, Integer pstatic, String ppwd, Integer ppost, String gangwei,
			String juesename, Integer jid) {
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
		this.gangwei = gangwei;
		this.juesename = juesename;
		this.jid = jid;
	}
	public lcpersonnelVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "lcpersonnelVo [pId=" + pId + ", bzId=" + bzId + ", pname=" + pname + ", psex=" + psex
				+ ", peducational=" + peducational + ", pentry=" + pentry + ", pphone=" + pphone + ", paddress="
				+ paddress + ", pidcard=" + pidcard + ", pstatic=" + pstatic + ", ppwd=" + ppwd + ", ppost=" + ppost
				+ ", gangwei=" + gangwei + ", juesename=" + juesename + ", jid=" + jid + "]";
	}
	
	

}
