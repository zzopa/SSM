package com.china.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;
@Repository
public class Extracharge {
    private Integer echargeid;

    private Integer houseid;

    private BigDecimal eaddbed;

    private BigDecimal cash;

    private String cook;

    private BigDecimal parkcharge;

    private BigDecimal clearcharge;

    public Integer getEchargeid() {
        return echargeid;
    }

    public void setEchargeid(Integer echargeid) {
        this.echargeid = echargeid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public BigDecimal getEaddbed() {
        return eaddbed;
    }

    public void setEaddbed(BigDecimal eaddbed) {
        this.eaddbed = eaddbed;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook == null ? null : cook.trim();
    }

    public BigDecimal getParkcharge() {
        return parkcharge;
    }

    public void setParkcharge(BigDecimal parkcharge) {
        this.parkcharge = parkcharge;
    }

    public BigDecimal getClearcharge() {
        return clearcharge;
    }

    public void setClearcharge(BigDecimal clearcharge) {
        this.clearcharge = clearcharge;
    }
}