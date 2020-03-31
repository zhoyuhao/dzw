package com.accp.dao.zyh;

import com.accp.pojo.Role;

public interface zyhRoleMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}