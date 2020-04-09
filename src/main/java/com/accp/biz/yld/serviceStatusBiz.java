package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.serviceStatusDao;
import com.accp.pojo.Statucs;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class serviceStatusBiz {

    @Autowired
    private serviceStatusDao dao;
    
    public List<Statucs> queryAll(){
	return dao.selectList(null);
    }
}
