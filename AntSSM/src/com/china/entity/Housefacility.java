package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Housefacility {
    private Integer housefacilityid;

    private String wifi;

    private String lift;

    private String icebox;

    private String washer;

    private String tv;

    private String pc;

    private String shower;

    private String park;

    private String allowold;

    private String allowchild;

    public Integer getHousefacilityid() {
        return housefacilityid;
    }

    public void setHousefacilityid(Integer housefacilityid) {
        this.housefacilityid = housefacilityid;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi == null ? null : wifi.trim();
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift == null ? null : lift.trim();
    }

    public String getIcebox() {
        return icebox;
    }

    public void setIcebox(String icebox) {
        this.icebox = icebox == null ? null : icebox.trim();
    }

    public String getWasher() {
        return washer;
    }

    public void setWasher(String washer) {
        this.washer = washer == null ? null : washer.trim();
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv == null ? null : tv.trim();
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc == null ? null : pc.trim();
    }

    public String getShower() {
        return shower;
    }

    public void setShower(String shower) {
        this.shower = shower == null ? null : shower.trim();
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park == null ? null : park.trim();
    }

    public String getAllowold() {
        return allowold;
    }

    public void setAllowold(String allowold) {
        this.allowold = allowold == null ? null : allowold.trim();
    }

    public String getAllowchild() {
        return allowchild;
    }

    public void setAllowchild(String allowchild) {
        this.allowchild = allowchild == null ? null : allowchild.trim();
    }
}