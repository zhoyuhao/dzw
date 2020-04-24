package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Legwork {
    
    @TableId(value = "legworkid", type = IdType.AUTO)
    private int legworkid;
    
    private String platenumber;
    
    private String brand;
    
    private String artisan;
    
    private Integer momey;
    
    private Integer wid;
    
    private String state;


	public String getArtisan() {
		return artisan;
	}
	public void setArtisan(String artisan) {
		this.artisan = artisan;
	}
	public Integer getMomey() {
		return momey;
	}
	public void setMomey(Integer momey) {
		this.momey = momey;
	}
	public Integer getWid() {
		return wid;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	public int getLegworkid() {
		return legworkid;
	}
	public void setLegworkid(int legworkid) {
		this.legworkid = legworkid;
	}
	public String getPlatenumber() {
		return platenumber;
	}
	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
