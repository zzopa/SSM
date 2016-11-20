package com.china.dao;

import com.china.entity.Housefacility;

public interface HousefacilityMapper {
    int deleteByPrimaryKey(Integer housefacilityid);

    int insert(Housefacility record);

    int insertSelective(Housefacility record);

    Housefacility selectByPrimaryKey(Integer housefacilityid);

    int updateByPrimaryKeySelective(Housefacility record);

    int updateByPrimaryKey(Housefacility record);
}