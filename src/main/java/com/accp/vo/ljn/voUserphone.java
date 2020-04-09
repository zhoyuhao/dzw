package com.accp.vo.ljn;

import java.util.Date;

public class voUserphone {
    private Integer txlid;

    private String pid;

    private String txlname;

    private String txlphone;
    
    private Integer bzid;

    public Integer getBzid() {
		return bzid;
	}

	public void setBzid(Integer bzid) {
		this.bzid = bzid;
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

    public Integer getTxlid() {
        return txlid;
    }

    public void setTxlid(Integer txlid) {
        this.txlid = txlid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getTxlname() {
        return txlname;
    }

    public void setTxlname(String txlname) {
        this.txlname = txlname == null ? null : txlname.trim();
    }

    public String getTxlphone() {
        return txlphone;
    }

    public void setTxlphone(String txlphone) {
        this.txlphone = txlphone == null ? null : txlphone.trim();
    }
}