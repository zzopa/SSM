package com.china.dao;

import com.china.entity.Image;

public interface ImageMapper {
    int deleteByPrimaryKey(Integer imageid);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer imageid);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}