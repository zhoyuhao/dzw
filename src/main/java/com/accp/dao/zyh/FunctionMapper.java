package com.accp.dao.zyh;

import com.accp.demo.pojo.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}