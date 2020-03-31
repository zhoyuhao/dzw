package com.accp.dao.zyh;

import com.accp.pojo.Personnel;

public interface zyhPersonnelMapper {
    int deleteByPrimaryKey(String pid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}