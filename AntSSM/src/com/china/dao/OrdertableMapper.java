package com.china.dao;

import com.china.entity.Ordertable;

public interface OrdertableMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Ordertable record);

    int insertSelective(Ordertable record);

    Ordertable selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Ordertable record);

    int updateByPrimaryKey(Ordertable record);
}