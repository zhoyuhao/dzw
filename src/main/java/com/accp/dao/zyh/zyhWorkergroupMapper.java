package com.accp.dao.zyh;

import com.accp.pojo.Workergroup;

public interface zyhWorkergroupMapper {
    int deleteByPrimaryKey(Integer bzid);

    int insert(Workergroup record);

    int insertSelective(Workergroup record);

    Workergroup selectByPrimaryKey(Integer bzid);

    int updateByPrimaryKeySelective(Workergroup record);

    int updateByPrimaryKey(Workergroup record);
}