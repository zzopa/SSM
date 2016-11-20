package com.china.dao;

import com.china.entity.Housecharge;

public interface HousechargeMapper {
    int deleteByPrimaryKey(Integer housechargeid);

    int insert(Housecharge record);

    int insertSelective(Housecharge record);

    Housecharge selectByPrimaryKey(Integer housechargeid);

    int updateByPrimaryKeySelective(Housecharge record);

    int updateByPrimaryKey(Housecharge record);
}