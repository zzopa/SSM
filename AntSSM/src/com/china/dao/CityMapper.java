package com.china.dao;

import com.china.entity.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer cityid);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer cityid);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}