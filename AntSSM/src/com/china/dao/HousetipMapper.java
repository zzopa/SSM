package com.china.dao;

import com.china.entity.Housetip;

public interface HousetipMapper {
    int deleteByPrimaryKey(Integer housetipid);

    int insert(Housetip record);

    int insertSelective(Housetip record);

    Housetip selectByPrimaryKey(Integer housetipid);

    int updateByPrimaryKeySelective(Housetip record);

    int updateByPrimaryKey(Housetip record);
}