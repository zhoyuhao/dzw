package com.accp.biz.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcroleMapper;
import com.accp.vo.lc.lcpostVo;
import com.accp.vo.lc.lcrolevo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcRoleBiz {
	
	@Autowired
	private lcroleMapper dao;
	
	public List<lcrolevo> queryall(){
		QueryWrapper<lcrolevo> qw=Wrappers.query();
		qw.notIn("cid", 1);
		return dao.selectList(qw);
	}

}
