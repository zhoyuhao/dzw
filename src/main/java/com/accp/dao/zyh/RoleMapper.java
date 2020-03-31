package com.accp.dao.zyh;

import com.accp.demo.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}