package com.accp.dao.zyh;

import com.accp.demo.pojo.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(String wid);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(String wid);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}