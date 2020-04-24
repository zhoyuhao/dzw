package com.accp.biz.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcPostMapper;
import com.accp.vo.lc.lcpostVo;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcPostBiz {

	@Autowired
	private lcPostMapper dao;
	
	public List<lcpostVo> queryall(){
		QueryWrapper<lcpostVo> qw=Wrappers.query();
		qw.notIn("pId", 1);
		return dao.selectList(qw);
	}
}
