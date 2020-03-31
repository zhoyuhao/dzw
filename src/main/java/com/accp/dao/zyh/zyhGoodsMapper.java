package com.accp.dao.zyh;

import com.accp.demo.pojo.Goods;

public interface zyhGoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}