package com.accp.biz.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ljn.ljnPersonnelDao;
import com.accp.dao.ljn.ljnServiceDao;
import com.accp.pojo.Personnel;

@Service
public class ljnPersonnelBiz {

	//查询员工编号
	@Resource ljnPersonnelDao dao;
	public List<Personnel> query() {
		return dao.query();
	}
	//查询编号是否已存在
	public int queryid(int pid) {
		return dao.queryid(pid);
	}
}
