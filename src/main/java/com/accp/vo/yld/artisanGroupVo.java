package com.accp.vo.yld;

public class artisanGroupVo {

    // 技工班组编号
    private String agid;
    // 技工班组名称
    private String agname;
    // 技工班组人数
    private Integer agnumber;
    // 技工班组人数
    private Integer hmoney;

    public Integer getHmoney() {
	return hmoney;
    }

    public void setHmoney(Integer hmoney) {
	this.hmoney = hmoney;
    }

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

}
