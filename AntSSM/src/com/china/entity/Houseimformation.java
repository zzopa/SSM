package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Houseimformation {
    private Integer houseimformationid;

    private String housemodel;

    private Integer housearea;

    private String addbed;

    private String exchangebed;

    public Integer getHouseimformationid() {
        return houseimformationid;
    }

    public void setHouseimformationid(Integer houseimformationid) {
        this.houseimformationid = houseimformationid;
    }

    public String getHousemodel() {
        return housemodel;
    }

    public void setHousemodel(String housemodel) {
        this.housemodel = housemodel == null ? null : housemodel.trim();
    }

    public Integer getHousearea() {
        return housearea;
    }

    public void setHousearea(Integer housearea) {
        this.housearea = housearea;
    }

    public String getAddbed() {
        return addbed;
    }

    public void setAddbed(String addbed) {
        this.addbed = addbed == null ? null : addbed.trim();
    }

    public String getExchangebed() {
        return exchangebed;
    }

    public void setExchangebed(String exchangebed) {
        this.exchangebed = exchangebed == null ? null : exchangebed.trim();
    }
}