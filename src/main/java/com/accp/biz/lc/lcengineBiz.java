package com.accp.biz.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcengineMapper;
import com.accp.vo.lc.lcengineVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcengineBiz {
	
	@Autowired
	private lcengineMapper dao;
	
	//查询所有发动机
	
	public List<lcengineVo> queryall(){
		return dao.selectList(null);
		
	}
}
