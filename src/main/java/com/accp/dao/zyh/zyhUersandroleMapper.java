package com.accp.dao.zyh;

import com.accp.demo.pojo.UersandroleKey;

public interface zyhUersandroleMapper {
    int deleteByPrimaryKey(UersandroleKey key);

    int insert(UersandroleKey record);

    int insertSelective(UersandroleKey record);
}