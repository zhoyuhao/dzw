package com.accp.dao.zyh;

import com.accp.demo.pojo.RoleandfunctionKey;

public interface zyhRoleandfunctionMapper {
    int deleteByPrimaryKey(RoleandfunctionKey key);

    int insert(RoleandfunctionKey record);

    int insertSelective(RoleandfunctionKey record);
}