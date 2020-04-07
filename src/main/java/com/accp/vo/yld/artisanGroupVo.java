package com.accp.vo.yld;

public class artisanGroupVo {

    // 技工班组编号
    private String agid;
    // 技工班组名称
    private String agname;
    // 技工班组人数
    private Integer agnumber;

    public String getAgid() {
	return agid;
    }

    public void setAgid(String agid) {
	this.agid = agid;
    }

    public String getAgname() {
	return agname;
    }

    public void setAgname(String agname) {
	this.agname = agname;
    }

    public Integer getAgnumber() {
	return agnumber;
    }

    public void setAgnumber(Integer agnumber) {
	this.agnumber = agnumber;
    }

    public artisanGroupVo() {
	// TODO Auto-generated constructor stub
    }

    public artisanGroupVo(String agid, String agname, Integer agnumber) {
	super();
	this.agid = agid;
	this.agname = agname;
	this.agnumber = agnumber;
    }

}
