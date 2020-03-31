package com.accp.dao.zyh;

import com.accp.pojo.Service;

public interface zyhServiceMapper {
    int deleteByPrimaryKey(String wid);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(String wid);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}