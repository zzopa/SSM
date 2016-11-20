package com.china.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;
@Repository
public class Housecharge {
    private Integer housechargeid;

    private BigDecimal price;

    private Double discount;

    public Integer getHousechargeid() {
        return housechargeid;
    }

    public void setHousechargeid(Integer housechargeid) {
        this.housechargeid = housechargeid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}