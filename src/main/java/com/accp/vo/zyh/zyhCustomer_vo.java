package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Customer;

public class zyhCustomer_vo extends Customer{
	
		private List<zyhCustomerCar_vo> list;

		public List<zyhCustomerCar_vo> getList() {
			return list;
		}

		public void setList(List<zyhCustomerCar_vo> list) {
			this.list = list;
		}
		
	
}
