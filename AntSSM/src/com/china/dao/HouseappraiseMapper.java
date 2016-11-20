package com.china.dao;

import com.china.entity.Houseappraise;

public interface HouseappraiseMapper {
    int deleteByPrimaryKey(Integer houseappraiseid);

    int insert(Houseappraise record);

    int insertSelective(Houseappraise record);

    Houseappraise selectByPrimaryKey(Integer houseappraiseid);

    int updateByPrimaryKeySelective(Houseappraise record);

    int updateByPrimaryKey(Houseappraise record);
}