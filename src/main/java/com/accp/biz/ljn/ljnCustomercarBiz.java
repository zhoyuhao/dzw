package com.accp.biz.ljn;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ljn.ljnCustomercarDao;
import com.accp.pojo.Customercar;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.injector.methods.DeleteByMap;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ljnCustomercarBiz {

	@Resource ljnCustomercarDao dao;
	//分页查询车型信息
	public PageInfo<Customercar> query(int pageNum,String carlicenceplate) {
		QueryWrapper<Customercar>qw=new QueryWrapper<>();
		qw.like("carlicenceplate", carlicenceplate);
		PageHelper.startPage(pageNum, 3);
		return new PageInfo<Customercar>(dao.selectList(qw));
	}
	//删除车辆信息
	public int remove(int carid) {
		Map<String, Object> co=new HashMap<String, Object>();
		co.put("carid", carid);
		return dao.deleteByMap(co);
	}
	//新增车辆信息
	public int add(Customercar entity) {
		return dao.insert(entity);
	}
	//查询指定车辆信息
	public Customercar queryid(int carid) {
		QueryWrapper<Customercar>qw=new QueryWrapper();
		qw.eq("carid", carid);
		return dao.selectOne(qw);
	}
	//修改车辆信息
	public int update(Customercar entity) {
		return dao.updateById(entity);
	}
}
