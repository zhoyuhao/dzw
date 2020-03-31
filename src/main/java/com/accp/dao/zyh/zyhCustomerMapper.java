package com.accp.dao.zyh;

import com.accp.demo.pojo.Customer;

public interface zyhCustomerMapper {
    int deleteByPrimaryKey(String cidk);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String cidk);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}