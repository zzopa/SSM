package com.china.dao;

import com.china.entity.House;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer houseid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}