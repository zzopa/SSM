package com.china.dao;

import com.china.entity.District;

public interface DistrictMapper {
    int deleteByPrimaryKey(Integer districtid);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer districtid);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}