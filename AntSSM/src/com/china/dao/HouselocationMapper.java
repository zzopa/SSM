package com.china.dao;

import com.china.entity.Houselocation;

public interface HouselocationMapper {
    int deleteByPrimaryKey(Integer houselocationid);

    int insert(Houselocation record);

    int insertSelective(Houselocation record);

    Houselocation selectByPrimaryKey(Integer houselocationid);

    int updateByPrimaryKeySelective(Houselocation record);

    int updateByPrimaryKey(Houselocation record);
}