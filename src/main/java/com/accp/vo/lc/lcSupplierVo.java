package com.accp.vo.lc;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("supplier")
public class lcSupplierVo {
	
	private Integer ghsid;

    private String ghsname;

    private String ghsaddress;

    private String ghsphone;

    private String ghsuser;

    private String ghsaccount;

	public Integer getGhsid() {
		return ghsid;
	}

	public void setGhsid(Integer ghsid) {
		this.ghsid = ghsid;
	}

	public String getGhsname() {
		return ghsname;
	}

	public void setGhsname(String ghsname) {
		this.ghsname = ghsname;
	}

	public String getGhsaddress() {
		return ghsaddress;
	}

	public void setGhsaddress(String ghsaddress) {
		this.ghsaddress = ghsaddress;
	}

	public String getGhsphone() {
		return ghsphone;
	}

	public void setGhsphone(String ghsphone) {
		this.ghsphone = ghsphone;
	}

	public String getGhsuser() {
		return ghsuser;
	}

	public void setGhsuser(String ghsuser) {
		this.ghsuser = ghsuser;
	}

	public String getGhsaccount() {
		return ghsaccount;
	}

	public void setGhsaccount(String ghsaccount) {
		this.ghsaccount = ghsaccount;
	}

	@Override
	public String toString() {
		return "lcSupplierVo [ghsid=" + ghsid + ", ghsname=" + ghsname + ", ghsaddress=" + ghsaddress + ", ghsphone="
				+ ghsphone + ", ghsuser=" + ghsuser + ", ghsaccount=" + ghsaccount + "]";
	}

	public lcSupplierVo(Integer ghsid, String ghsname, String ghsaddress, String ghsphone, String ghsuser,
			String ghsaccount) {
		super();
		this.ghsid = ghsid;
		this.ghsname = ghsname;
		this.ghsaddress = ghsaddress;
		this.ghsphone = ghsphone;
		this.ghsuser = ghsuser;
		this.ghsaccount = ghsaccount;
	}

	public lcSupplierVo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
