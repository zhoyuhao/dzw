package com.accp.biz.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.CqqCustomerDao;
import com.accp.dao.cqq.CqqServiceDao;
import com.accp.pojo.Customer;
import com.accp.vo.cqq.ChongZhiList;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqCustomerBiz {

	@Autowired
	private CqqCustomerDao cqqCustomerDao;
	
	@Autowired
	private CqqServiceDao dao;
	/**
	 * 会员查询
	 *  //
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<ChongZhiList> selectCustomerList(Integer n, Integer s,String val) {
		PageHelper.startPage(n, s);
		QueryWrapper<Customer> qw = Wrappers.query();
		qw.like("cidk", val);
		qw.eq("ctypek", "会员");
		return new PageInfo<ChongZhiList>(dao.queryChongZhi(val));
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
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int customerUpdate(Customer customer,String money) {
		if(dao.huiyuanMoneyAddJiLu(money, customer.getCidk())==0) {
			return 0;
		}
		return cqqCustomerDao.updateById(customer);
	}

}
