package com.zhiyu.model;

import java.math.BigDecimal;

/**
 * Created by bruce on 2017/3/12.
 */
public class StatAdInfo {
    private String adId;
    private String adPlanId;
    private String day;
    private String hour;
    private BigDecimal cost;
    private int pv;
    private int clk;
    private int inst;

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getClk() {
        return clk;
    }

    public void setClk(int clk) {
        this.clk = clk;
    }

    public int getInst() {
        return inst;
    }

    public void setInst(int inst) {
        this.inst = inst;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAdPlanId() {
        return adPlanId;
    }

    public void setAdPlanId(String adPlanId) {
        this.adPlanId = adPlanId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
