package com.accp.biz.yld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.serviceinfoDao;
import com.accp.pojo.Servicedetailed;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class serviceInfoBiz {

    @Autowired
    private serviceinfoDao dao;
    
    public int insertServiceInfo(Servicedetailed entity) {
	return dao.insert(entity);
    }
}
