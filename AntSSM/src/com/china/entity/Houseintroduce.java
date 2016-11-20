package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Houseintroduce {
    private Integer houseintroduceid;

    private String holderappraise;

    private String holderlocation;

    private String holdertraffic;

    private String holderaround;

    private String holderrule;

    private String others;

    public Integer getHouseintroduceid() {
        return houseintroduceid;
    }

    public void setHouseintroduceid(Integer houseintroduceid) {
        this.houseintroduceid = houseintroduceid;
    }

    public String getHolderappraise() {
        return holderappraise;
    }

    public void setHolderappraise(String holderappraise) {
        this.holderappraise = holderappraise == null ? null : holderappraise.trim();
    }

    public String getHolderlocation() {
        return holderlocation;
    }

    public void setHolderlocation(String holderlocation) {
        this.holderlocation = holderlocation == null ? null : holderlocation.trim();
    }

    public String getHoldertraffic() {
        return holdertraffic;
    }

    public void setHoldertraffic(String holdertraffic) {
        this.holdertraffic = holdertraffic == null ? null : holdertraffic.trim();
    }

    public String getHolderaround() {
        return holderaround;
    }

    public void setHolderaround(String holderaround) {
        this.holderaround = holderaround == null ? null : holderaround.trim();
    }

    public String getHolderrule() {
        return holderrule;
    }

    public void setHolderrule(String holderrule) {
        this.holderrule = holderrule == null ? null : holderrule.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }
}