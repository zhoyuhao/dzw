package com.accp.biz.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcworkergroupMapper;
import com.accp.vo.lc.lcworkergroupVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcworkergroupBiz {
	@Autowired
	private lcworkergroupMapper dao;
	
	//已有的技工做员工修改和添加
	public List<lcworkergroupVo> querall(){
		return dao.selectList(null);
	}

}
