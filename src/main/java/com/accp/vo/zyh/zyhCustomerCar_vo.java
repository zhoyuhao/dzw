package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Customercar;

public class zyhCustomerCar_vo extends Customercar{
	
	
	private List<zyhService_vo> list;

	public List<zyhService_vo> getList() {
		return list;
	}

	public void setList(List<zyhService_vo> list) {
		this.list = list;
	}
	
}
