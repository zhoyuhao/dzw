package com.accp.dao.zyh;

import com.accp.demo.pojo.Customercar;

public interface CustomercarMapper {
    int deleteByPrimaryKey(Integer carid);

    int insert(Customercar record);

    int insertSelective(Customercar record);

    Customercar selectByPrimaryKey(Integer carid);

    int updateByPrimaryKeySelective(Customercar record);

    int updateByPrimaryKey(Customercar record);
}