package com.accp.biz.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.CqqPersonnelDao;
import com.accp.pojo.Personnel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqPersonnelBiz {

	@Autowired
	private CqqPersonnelDao cqqPersonnelDao;

	/**
	 * 查询离职员工
	 * 
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<Personnel> selectCustomerList(Integer n, Integer s, Integer pstatic, String name) {
		PageHelper.startPage(n, s);
		QueryWrapper<Personnel> qw = Wrappers.query();
		qw.notIn("pname", "admin");
		qw.eq("pstatic", pstatic).like("pname", "null".equals(name) ? "" : name);// 0就职， 1代表离职
		return new PageInfo<Personnel>(cqqPersonnelDao.selectList(qw));
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
