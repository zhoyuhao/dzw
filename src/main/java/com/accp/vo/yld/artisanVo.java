package com.accp.vo.yld;

public class artisanVo {

    //员工编号
    private String aid;
    //员工姓名
    private String name;
    //岗位名称
    private String postName;
    //班组名称
    private String groupName;
    
    public String getAid() {
        return aid;
    }
    public void setAid(String aid) {
        this.aid = aid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPostName() {
        return postName;
    }
    public void setPostName(String postName) {
        this.postName = postName;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    public artisanVo() {
	// TODO Auto-generated constructor stub
    }
    
    public artisanVo(String aid, String name, String postName, String groupName) {
	super();
	this.aid = aid;
	this.name = name;
	this.postName = postName;
	this.groupName = groupName;
    }
    
}
