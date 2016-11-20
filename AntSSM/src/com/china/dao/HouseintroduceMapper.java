package com.china.dao;

import com.china.entity.Houseintroduce;

public interface HouseintroduceMapper {
    int deleteByPrimaryKey(Integer houseintroduceid);

    int insert(Houseintroduce record);

    int insertSelective(Houseintroduce record);

    Houseintroduce selectByPrimaryKey(Integer houseintroduceid);

    int updateByPrimaryKeySelective(Houseintroduce record);

    int updateByPrimaryKey(Houseintroduce record);
}