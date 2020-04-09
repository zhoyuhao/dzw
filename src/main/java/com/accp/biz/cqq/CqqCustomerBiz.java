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
	public PageInfo<Customer> selectCustomerList(Integer n, Integer s) {
		PageHelper.startPage(n, s);
		QueryWrapper<Customer> qw = Wrappers.query();
		return new PageInfo<Customer>(cqqCustomerDao.selectList(qw));
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
