package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Legwork {

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
	@TableId(value = "legworkid",type = IdType.AUTO)
	private int legworkid;
	private String platenumber;
	private String brand;
	private String state;
	private String artisan;
	private int momey;
	public int getMomey() {
		return momey;
	}
	public void setMomey(int momey) {
		this.momey = momey;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	private int wid;
	
	
	public String getArtisan() {
		return artisan;
	}
	public void setArtisan(String artisan) {
		this.artisan = artisan;
	}
}
