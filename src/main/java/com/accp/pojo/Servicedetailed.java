package com.accp.pojo;

public class Servicedetailed {
	private Integer sdid;

	private String wid;

	private String sdname;

	private Float sdprice;


	private Float sdnumber;

    private Float dprice;
    

	@Override
	public String toString() {
		return "Servicedetailed [sdid=" + sdid + ", wid=" + wid + ", sdname=" + sdname + ", sdprice=" + sdprice
				+ ", sdnumber=" + sdnumber + "]";
	}

    
    public Float getDprice() {
        return dprice;
    }

    public void setDprice(Float dprice) {
        this.dprice = dprice;
    }

    public Integer getSdid() {
        return sdid;
    }



	public void setSdid(Integer sdid) {
		this.sdid = sdid;
	}

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid == null ? null : wid.trim();
	}

	public String getSdname() {
		return sdname;
	}

	public void setSdname(String sdname) {
		this.sdname = sdname == null ? null : sdname.trim();
	}

	public Float getSdprice() {
		return sdprice;
	}

	public void setSdprice(Float sdprice) {
		this.sdprice = sdprice;
	}

	public Float getSdnumber() {
		return sdnumber;
	}

	public void setSdnumber(Float sdnumber) {
		this.sdnumber = sdnumber;
	}
}