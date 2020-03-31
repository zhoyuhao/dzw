package com.accp.dao.zyh;

import com.accp.demo.pojo.Eengine;

public interface EengineMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Eengine record);

    int insertSelective(Eengine record);

    Eengine selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Eengine record);

    int updateByPrimaryKey(Eengine record);
}