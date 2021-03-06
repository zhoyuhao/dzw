package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.customerDao;
import com.accp.pojo.Customer;
import com.accp.vo.yld.customerVo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class customerBiz {

    @Autowired
    private customerDao dao;
    
    public List<Customer> queryAll() {
	return dao.selectList(null);
    }
    
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int InsertCustomerAndCar(customerVo temp) {
	return dao.InsertCustomerAndCar(temp);
    }
}
