package com.china.dao;

import com.china.entity.Orderitem;

public interface OrderitemMapper {
    int deleteByPrimaryKey(Integer orderitemid);

    int insert(Orderitem record);

    int insertSelective(Orderitem record);

    Orderitem selectByPrimaryKey(Integer orderitemid);

    int updateByPrimaryKeySelective(Orderitem record);

    int updateByPrimaryKey(Orderitem record);
}