package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class House {
    private Integer houseid;

    private Integer housetypeid;

    private Integer housetipid;

    private Integer houselocationid;

    private Integer housefacilityid;

    private Integer householderid;

    private Integer houseintroduceid;

    private Integer housechargeid;

    private Integer houseimformationid;

    private Integer houseappraiseid;

    private String housestatus;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Integer housetypeid) {
        this.housetypeid = housetypeid;
    }

    public Integer getHousetipid() {
        return housetipid;
    }

    public void setHousetipid(Integer housetipid) {
        this.housetipid = housetipid;
    }

    public Integer getHouselocationid() {
        return houselocationid;
    }

    public void setHouselocationid(Integer houselocationid) {
        this.houselocationid = houselocationid;
    }

    public Integer getHousefacilityid() {
        return housefacilityid;
    }

    public void setHousefacilityid(Integer housefacilityid) {
        this.housefacilityid = housefacilityid;
    }

    public Integer getHouseholderid() {
        return householderid;
    }

    public void setHouseholderid(Integer householderid) {
        this.householderid = householderid;
    }

    public Integer getHouseintroduceid() {
        return houseintroduceid;
    }

    public void setHouseintroduceid(Integer houseintroduceid) {
        this.houseintroduceid = houseintroduceid;
    }

    public Integer getHousechargeid() {
        return housechargeid;
    }

    public void setHousechargeid(Integer housechargeid) {
        this.housechargeid = housechargeid;
    }

    public Integer getHouseimformationid() {
        return houseimformationid;
    }

    public void setHouseimformationid(Integer houseimformationid) {
        this.houseimformationid = houseimformationid;
    }

    public Integer getHouseappraiseid() {
        return houseappraiseid;
    }

    public void setHouseappraiseid(Integer houseappraiseid) {
        this.houseappraiseid = houseappraiseid;
    }

    public String getHousestatus() {
        return housestatus;
    }

    public void setHousestatus(String housestatus) {
        this.housestatus = housestatus == null ? null : housestatus.trim();
    }
}