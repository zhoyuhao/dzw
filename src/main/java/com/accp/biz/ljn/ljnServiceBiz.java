package com.accp.biz.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ljn.ljnServiceDao;

@Service
public class ljnServiceBiz {

	@Resource ljnServiceDao dao;
	//查询接单信息
	public List<com.accp.pojo.Service> query() {
		return dao.query();
	}
	//更改维修状态
	public int update(int wstatic,int wid) {
		return dao.update(wstatic,wid);
	}
}
