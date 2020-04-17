package com.accp.biz.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.CqqCustomerDao;
import com.accp.pojo.Customer;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqCustomerBiz {

	@Autowired
	private CqqCustomerDao cqqCustomerDao;

	/**
	 * 会员查询
	 * 
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<Customer> selectCustomerList(Integer n, Integer s,String val) {
		PageHelper.startPage(n, s);
		QueryWrapper<Customer> qw = Wrappers.query();
		qw.like("cidk", val);
		qw.eq("ctypek", "会员");
		return new PageInfo<Customer>(cqqCustomerDao.selectList(qw));
	}

	/**
	 * 查询单个会员
	 * 
	 * @param id
	 * @return
	 */
	public Customer selectCustomer(String id) {
		QueryWrapper<Customer> qw = Wrappers.query();
		qw.eq("ckahaok", id);
		Customer cus = cqqCustomerDao.selectOne(qw);
		System.out.println("[////"+cus);
		if (cus != null) {
			return cus;
		}
		return null;
	}

	/**
	 * 会员充值
	 * 
	 * @param customer
	 * @return
	 */
	public int customerUpdate(Customer customer) {
		return cqqCustomerDao.updateById(customer);
	}

}
