package com.china.dao;

import com.china.entity.Extracharge;

public interface ExtrachargeMapper {
    int deleteByPrimaryKey(Integer echargeid);

    int insert(Extracharge record);

    int insertSelective(Extracharge record);

    Extracharge selectByPrimaryKey(Integer echargeid);

    int updateByPrimaryKeySelective(Extracharge record);

    int updateByPrimaryKey(Extracharge record);
}