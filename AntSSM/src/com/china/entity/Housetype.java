package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Housetype {
    private Integer housetypeid;

    private String housetypename;

    public Integer getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Integer housetypeid) {
        this.housetypeid = housetypeid;
    }

    public String getHousetypename() {
        return housetypename;
    }

    public void setHousetypename(String housetypename) {
        this.housetypename = housetypename == null ? null : housetypename.trim();
    }
}