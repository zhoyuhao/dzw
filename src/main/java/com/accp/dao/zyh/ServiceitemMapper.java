package com.accp.dao.zyh;

import com.accp.demo.pojo.Serviceitem;

public interface ServiceitemMapper {
    int deleteByPrimaryKey(Integer xmid);

    int insert(Serviceitem record);

    int insertSelective(Serviceitem record);

    Serviceitem selectByPrimaryKey(Integer xmid);

    int updateByPrimaryKeySelective(Serviceitem record);

    int updateByPrimaryKey(Serviceitem record);
}