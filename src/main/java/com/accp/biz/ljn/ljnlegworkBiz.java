package com.accp.biz.ljn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ljn.ljnlegworkDao;
import com.accp.pojo.Legwork;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ljnlegworkBiz {

	@Resource ljnlegworkDao dao;
	
	//查询外勤信息
	public PageInfo<Legwork> query(int pageNum,String state) {
		QueryWrapper<Legwork> qw=new QueryWrapper<>();
		qw.eq("state",state);
		PageHelper.startPage(pageNum, 3);
		return new PageInfo<Legwork>(dao.selectList(qw)); 
	}
	//编辑外勤信息
	public int update(Legwork entity) {
		return dao.updateById(entity);
	}
	//新增外勤信息
	public int insert(Legwork entity) {
		return dao.insert(entity);
	}
	//删除外勤信息
	public int delete(int legworkid) {
		return dao.deleteById(legworkid);
	}
	//查询指定外勤车辆信息
	public Legwork queryid(int legworkid) {
		return dao.selectById(legworkid);
	}
}
