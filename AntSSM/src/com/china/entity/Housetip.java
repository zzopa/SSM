package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Housetip {
    private Integer housetipid;

    private String worktime;

    private String inhouse;

    private String outhouse;

    private String minitime;

    private String faxbill;

    private String maxtime;

    public Integer getHousetipid() {
        return housetipid;
    }

    public void setHousetipid(Integer housetipid) {
        this.housetipid = housetipid;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
    }

    public String getInhouse() {
        return inhouse;
    }

    public void setInhouse(String inhouse) {
        this.inhouse = inhouse == null ? null : inhouse.trim();
    }

    public String getOuthouse() {
        return outhouse;
    }

    public void setOuthouse(String outhouse) {
        this.outhouse = outhouse == null ? null : outhouse.trim();
    }

    public String getMinitime() {
        return minitime;
    }

    public void setMinitime(String minitime) {
        this.minitime = minitime == null ? null : minitime.trim();
    }

    public String getFaxbill() {
        return faxbill;
    }

    public void setFaxbill(String faxbill) {
        this.faxbill = faxbill == null ? null : faxbill.trim();
    }

    public String getMaxtime() {
        return maxtime;
    }

    public void setMaxtime(String maxtime) {
        this.maxtime = maxtime == null ? null : maxtime.trim();
    }
}