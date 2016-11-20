package com.china.dao;

import org.springframework.stereotype.Repository;

import com.china.entity.Province;
@Repository  
public interface ProvinceMapper {
    int deleteByPrimaryKey(Integer provinceid);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer provinceid);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}