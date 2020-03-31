package com.accp.dao.zyh;

import com.accp.demo.pojo.Servicedetailed;

public interface zyhServicedetailedMapper {
    int deleteByPrimaryKey(Integer sdid);

    int insert(Servicedetailed record);

    int insertSelective(Servicedetailed record);

    Servicedetailed selectByPrimaryKey(Integer sdid);

    int updateByPrimaryKeySelective(Servicedetailed record);

    int updateByPrimaryKey(Servicedetailed record);
}