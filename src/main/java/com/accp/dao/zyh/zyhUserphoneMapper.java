package com.accp.dao.zyh;

import com.accp.demo.pojo.Userphone;

public interface zyhUserphoneMapper {
    int deleteByPrimaryKey(Integer txlid);

    int insert(Userphone record);

    int insertSelective(Userphone record);

    Userphone selectByPrimaryKey(Integer txlid);

    int updateByPrimaryKeySelective(Userphone record);

    int updateByPrimaryKey(Userphone record);
}