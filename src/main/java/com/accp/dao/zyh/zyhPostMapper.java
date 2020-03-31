package com.accp.dao.zyh;

import com.accp.pojo.Post;

public interface zyhPostMapper {
    int deleteByPrimaryKey(Integer gwid);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer gwid);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}