package com.accp.action.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cqq.CqqCustomerBiz;
import com.accp.pojo.Customer;
import com.accp.pojo.Supplier;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("CqqCustomerAction/api")
public class CqqCustomerAction {
//
	@Autowired
	private CqqCustomerBiz cqqCustomerBiz;

	@GetMapping("{n}/{s}")
	public PageInfo<Customer> selectCustomerList(@PathVariable Integer n, @PathVariable Integer s) {
		return cqqCustomerBiz.selectCustomerList(n, s);
	}

	@PostMapping("update")
	public int customerUpdate(@RequestBody Customer customer) {
		System.out.println("会员充值");
		return cqqCustomerBiz.customerUpdate(customer);
	}

	@GetMapping("{id}")
	public Customer selectCustomer(@PathVariable String id) {
		System.out.println("id:/"+id);
		return cqqCustomerBiz.selectCustomer(id);
	}

}
