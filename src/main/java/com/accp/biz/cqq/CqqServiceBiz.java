package com.accp.biz.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.CqqServiceDao;
import com.accp.pojo.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqServiceBiz {

	@Autowired
	private CqqServiceDao cqqServiceDao;

	/**
	 * 结算中心查询
	 * 
	 * @return
	 */
	public PageInfo<Service> selectServiceList(Integer n, Integer s) {
		PageHelper.startPage(n, s);
		QueryWrapper<Service> qw = Wrappers.query();
		return new PageInfo<Service>(cqqServiceDao.selectList(qw));
	}
}
