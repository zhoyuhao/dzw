package com.accp.dao.yld;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Customer;
import com.accp.vo.yld.customerVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface customerDao extends BaseMapper<Customer> {

    int InsertCustomerAndCar(@Param("temp")customerVo temp);
}
