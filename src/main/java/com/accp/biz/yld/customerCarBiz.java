package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.customerCarDao;
import com.accp.pojo.Customercar;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class customerCarBiz {

    @Autowired
    private customerCarDao dao;
    
    public List<Customercar> queryByPrsId(String id) {
	QueryWrapper<Customercar> qw = Wrappers.query();
	qw.eq("cidk", id);
	return dao.selectList(qw);
    }
    
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int insertCustomerCar(Customercar entity) {
	return dao.insert(entity);
    }
}
