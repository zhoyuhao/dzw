package com.accp.biz.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.CqqPersonnelDao;
import com.accp.dao.cqq.CqqServiceDao;
import com.accp.pojo.Personnel;
import com.accp.vo.zyh.zyhpersonnel_vo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqPersonnelBiz {

	@Autowired
	private CqqPersonnelDao cqqPersonnelDao;

	@Autowired
	private CqqServiceDao dao;
	/**
	 * 查询离职员工
	 * 
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<zyhpersonnel_vo> selectCustomerList(Integer n, Integer s, Integer pstatic, String name) {
		PageHelper.startPage(n, s);
		return new PageInfo<zyhpersonnel_vo>(dao.queryLiZhi(pstatic, "null".equals(name)?"": name));
	}

	/**
	 * 复职与离职
	 * 
	 * @param personnel
	 * @return
	 */
	public int personnelUpdate(Personnel personnel) {
		return cqqPersonnelDao.updateById(personnel);
	}

	/**
	 * 删除离职员工的信息
	 * 
	 * @param id
	 * @return
	 */
	public int personnelDelete(Integer id) {
		return cqqPersonnelDao.deleteById(id);
	}

	/**
	 * 查询单个离职员工
	 * 
	 * @param id
	 * @return
	 */
	public Personnel selectpersonnelPojo(Integer id) {
		return cqqPersonnelDao.selectById(id);
	}
}
