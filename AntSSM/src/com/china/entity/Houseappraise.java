package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Houseappraise {
    private Integer houseappraiseid;

    private String context;

    private Integer clear;

    private Integer service;

    private Integer costefficiency;

    private Integer trafic;

    private Integer environment;

    private String appraise;

    private String reply;

    public Integer getHouseappraiseid() {
        return houseappraiseid;
    }

    public void setHouseappraiseid(Integer houseappraiseid) {
        this.houseappraiseid = houseappraiseid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Integer getClear() {
        return clear;
    }

    public void setClear(Integer clear) {
        this.clear = clear;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getCostefficiency() {
        return costefficiency;
    }

    public void setCostefficiency(Integer costefficiency) {
        this.costefficiency = costefficiency;
    }

    public Integer getTrafic() {
        return trafic;
    }

    public void setTrafic(Integer trafic) {
        this.trafic = trafic;
    }

    public Integer getEnvironment() {
        return environment;
    }

    public void setEnvironment(Integer environment) {
        this.environment = environment;
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise == null ? null : appraise.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }
}