package com.accp.biz.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ljn.ljnUserphoneDao;
import com.accp.pojo.Userphone;
import com.accp.vo.ljn.voUserphone;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.injector.methods.DeleteByMap;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ljnUserphoneBiz {

	@Resource ljnUserphoneDao dao;
	//分页查询出通讯录信息
	public PageInfo<voUserphone> query(int pageNum,int pageSize,String pname) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<voUserphone>(dao.query(pname));
	}
	//新增通讯录信息
	public int add(String pid,String pname,String pphone) {
		return dao.add(pid, pname, pphone);
	}
	//删除通讯录信息
	public int remove(int id) {
		return dao.remove(id);
	}
	//修改通讯录信息
	public int update(Userphone us) {
		return dao.update(us);
	}
	//根据编号查询通讯录信息
	public Userphone queryid(int txlid) {
		return dao.queryid(txlid);
	}
	//查询编号是否已存在
	public int count(int pid) {
		return dao.count(pid);
	}
}
