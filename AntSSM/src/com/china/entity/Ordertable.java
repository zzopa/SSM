package com.china.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class Ordertable {
    private Integer orderid;

    private Integer householderid;

    private Date odate;

    private BigDecimal oprice;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getHouseholderid() {
        return householderid;
    }

    public void setHouseholderid(Integer householderid) {
        this.householderid = householderid;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public BigDecimal getOprice() {
        return oprice;
    }

    public void setOprice(BigDecimal oprice) {
        this.oprice = oprice;
    }
}