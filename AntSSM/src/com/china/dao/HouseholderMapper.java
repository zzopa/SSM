package com.china.dao;

import com.china.entity.Householder;

public interface HouseholderMapper {
    int deleteByPrimaryKey(Integer householderid);

    int insert(Householder record);

    int insertSelective(Householder record);

    Householder selectByPrimaryKey(Integer householderid);

    int updateByPrimaryKeySelective(Householder record);

    int updateByPrimaryKey(Householder record);
}