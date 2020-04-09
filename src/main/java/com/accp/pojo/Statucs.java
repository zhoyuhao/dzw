package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("statucs")
public class Statucs {

    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    private String statucname;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getStatucname() {
	return statucname;
    }

    public void setStatucname(String statucname) {
	this.statucname = statucname;
    }

}
