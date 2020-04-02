package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Supplier {

	@TableId(value = "ghsid")
	private Integer ghsid;// 供货商id

	private String ghsname;// 供货商名称

	private String ghsaddress;// 供货商地址

	private String ghsphone;// 供货商联系电话

	private String ghsuser;// 联系人

	private String ghsaccount;// 打款账号

	@Override
	public String toString() {
		return "Supplier [ghsid=" + ghsid + ", ghsname=" + ghsname + ", ghsaddress=" + ghsaddress + ", ghsphone="
				+ ghsphone + ", ghsuser=" + ghsuser + ", ghsaccount=" + ghsaccount + "]";
	}

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
		this.ghsname = ghsname == null ? null : ghsname.trim();
	}

	public String getGhsaddress() {
		return ghsaddress;
	}

	public void setGhsaddress(String ghsaddress) {
		this.ghsaddress = ghsaddress == null ? null : ghsaddress.trim();
	}

	public String getGhsphone() {
		return ghsphone;
	}

	public void setGhsphone(String ghsphone) {
		this.ghsphone = ghsphone == null ? null : ghsphone.trim();
	}

	public String getGhsuser() {
		return ghsuser;
	}

	public void setGhsuser(String ghsuser) {
		this.ghsuser = ghsuser == null ? null : ghsuser.trim();
	}

	public String getGhsaccount() {
		return ghsaccount;
	}

	public void setGhsaccount(String ghsaccount) {
		this.ghsaccount = ghsaccount == null ? null : ghsaccount.trim();
	}
}