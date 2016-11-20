package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Image {
    private Integer imageid;

    private Integer houseid;

    private String imagenamme;

    private String imageurl;

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getImagenamme() {
        return imagenamme;
    }

    public void setImagenamme(String imagenamme) {
        this.imagenamme = imagenamme == null ? null : imagenamme.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }
}