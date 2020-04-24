package com.accp.dao.cqq;

import com.accp.vo.cqq.Huiyuanjilu;

public interface HuiyuanjiluMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Huiyuanjilu record);

    int insertSelective(Huiyuanjilu record);

    Huiyuanjilu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Huiyuanjilu record);

    int updateByPrimaryKey(Huiyuanjilu record);
}