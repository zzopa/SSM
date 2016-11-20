package com.china.entity;

import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class Orderitem {
    private Integer orderitemid;

    private Integer orderid;

    private Date ointime;

    private Date oouttime;

    private String ostatus;

    public Integer getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(Integer orderitemid) {
        this.orderitemid = orderitemid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOintime() {
        return ointime;
    }

    public void setOintime(Date ointime) {
        this.ointime = ointime;
    }

    public Date getOouttime() {
        return oouttime;
    }

    public void setOouttime(Date oouttime) {
        this.oouttime = oouttime;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus == null ? null : ostatus.trim();
    }
}