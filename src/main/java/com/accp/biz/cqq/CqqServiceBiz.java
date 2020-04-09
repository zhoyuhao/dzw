package com.accp.biz.cqq;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.CqqServiceDao;
import com.accp.dao.cqq.CqqServicedetailedDao;
import com.accp.pojo.Service;
import com.accp.pojo.Servicedetailed;
import com.accp.vo.cqq.CqqServiceVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqServiceBiz {

	@Autowired
	private CqqServiceDao cqqServiceDao;

	@Autowired
	private CqqServicedetailedDao cqqServicedetailedDao;

	/**
	 * 收银
	 * 
	 * @param id
	 * @return
	 */
	public int updateService(Service service) {
		return cqqServiceDao.updateById(service);
	}

	/**
	 * 结算中心查询
	 * 
	 * @return
	 */
	public PageInfo<Service> selectServiceList(Integer n, Integer s, Integer wid, String name) {
		PageHelper.startPage(n, s);
		QueryWrapper<Service> qw = Wrappers.query();
		
		System.out.println("wid:" + wid + "/name:" + name);
		if (wid != 0) {
			qw.eq("wstatic", wid);
		}else {
			qw.eq("wstatic", 3);
		}
		qw.like("wname", "null".equals(name) ? "" : name);
		return new PageInfo<Service>(cqqServiceDao.selectList(qw));
	}

	/**
	 * 结算中心查询vo
	 * 
	 * @return
	 */
	public PageInfo<CqqServiceVo> selectServiceVoList(Integer n, Integer s) {
		PageHelper.startPage(n, s);
		QueryWrapper<Service> qw = Wrappers.query();// 主表
		QueryWrapper<Servicedetailed> qw2 = Wrappers.query();// 详表
		List<Service> serList = cqqServiceDao.selectList(qw);
		List<CqqServiceVo> serVoList = new ArrayList<CqqServiceVo>();
		for (Service service : serList) {
			System.out.println("循环");
			qw2.eq("wId", service.getWid());
			serVoList.add(new CqqServiceVo(service, cqqServicedetailedDao.selectList(qw2)));
		}
		return new PageInfo<CqqServiceVo>(serVoList);
	}
}
