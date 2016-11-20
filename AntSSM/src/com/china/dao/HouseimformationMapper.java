package com.china.dao;

import com.china.entity.Houseimformation;

public interface HouseimformationMapper {
    int deleteByPrimaryKey(Integer houseimformationid);

    int insert(Houseimformation record);

    int insertSelective(Houseimformation record);

    Houseimformation selectByPrimaryKey(Integer houseimformationid);

    int updateByPrimaryKeySelective(Houseimformation record);

    int updateByPrimaryKey(Houseimformation record);
}