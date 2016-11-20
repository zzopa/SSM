package com.china.dao;

import com.china.entity.Housetype;

public interface HousetypeMapper {
    int deleteByPrimaryKey(Integer housetypeid);

    int insert(Housetype record);

    int insertSelective(Housetype record);

    Housetype selectByPrimaryKey(Integer housetypeid);

    int updateByPrimaryKeySelective(Housetype record);

    int updateByPrimaryKey(Housetype record);
}