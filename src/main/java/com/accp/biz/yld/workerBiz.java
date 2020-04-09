package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.workerDao;
import com.accp.pojo.Workergroup;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class workerBiz {

    @Autowired
    private workerDao dao;
    
    public List<Workergroup> queryAll(){
	return dao.selectList(null);
    }
    
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int insertWorkerGroup(Workergroup entity) {
	return dao.insert(entity);
    }
    
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int deleteWorkerGroup(Integer id) {
	return dao.deleteById(id);
    }
    
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int updateWorkerGroup(Workergroup entity) {
	return dao.updateById(entity);
    }
}
