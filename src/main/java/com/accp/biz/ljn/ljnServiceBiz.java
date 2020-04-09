package com.accp.biz.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ljn.ljnServiceDao;

@Service
public class ljnServiceBiz {

	@Resource ljnServiceDao dao;
	public List<com.accp.pojo.Service> query() {
		return dao.query();
	}
}
