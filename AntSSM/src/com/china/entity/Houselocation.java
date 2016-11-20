package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Houselocation {
    private Integer houselocationid;

    private Integer businessid;

    private Integer cityid;

    private Integer districtid;

    private Integer provinceid;

    private String detailaddress;

    public Integer getHouselocationid() {
        return houselocationid;
    }

    public void setHouselocationid(Integer houselocationid) {
        this.houselocationid = houselocationid;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }
}