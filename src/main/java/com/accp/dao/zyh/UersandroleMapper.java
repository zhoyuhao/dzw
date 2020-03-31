package com.accp.dao.zyh;

import com.accp.demo.pojo.UersandroleKey;

public interface UersandroleMapper {
    int deleteByPrimaryKey(UersandroleKey key);

    int insert(UersandroleKey record);

    int insertSelective(UersandroleKey record);
}