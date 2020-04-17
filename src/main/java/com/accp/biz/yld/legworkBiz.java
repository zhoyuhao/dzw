package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.legworkDao;
import com.accp.pojo.Legwork;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class legworkBiz {

    @Autowired
    private legworkDao dao;
    
    //查询未出车的车辆
    public List<Legwork> queryAllNotOut() {
	QueryWrapper<Legwork> qw = Wrappers.query();
	qw.eq("state", "未出车");
	return dao.selectList(qw);
    }
    
    public int updateCarState(Legwork entity) {
	return dao.updateById(entity);
    }
}
