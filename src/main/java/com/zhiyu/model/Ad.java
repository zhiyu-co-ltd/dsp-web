package com.zhiyu.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/30.
 */
@Table(name="T_Ad")
public class Ad extends BaseEntity{

    @Column(name="name")
    private String Name;
    @Column(name="user_id")
    private String user_id;
    @Column(name="ad_id")
    private String ad_id;
    @Column(name="adplan_id")
    private String adplan_id;
    @Column(name="adplan_name")
    private String adplan_name;
    @Column(name="status")
    private int Status;
    @Column(name="delivery_type")
    private int delivery_type;
    @Column(name="offer_price")
    private Double offer_price;
    @Column(name="telecom_operator")
    private String telecom_operator;
    @Column(name="network_type")
    private String network_type;
    @Column(name="operate_system")
    private String operate_system;
    @Column(name="pdb_platform")
    private String pdb_platform;
    @Column(name="gender_type")
    private int gender_type;
    @Column(name="launch_area")
    private String launch_area;
    @Column(name="launch_people")
    private String launch_people;
    @Column(name="display_times")
    private int display_times;
    @Column(name="launch_time_start")
    private String launch_time_start;
    @Column(name="launch_end_time")
    private String launch_end_time;
    @Column(name="ad_url")
    private String ad_url;
    @Column(name="callback_url")
    private String callback_url;
    @Column(name="daily_limit_money")
    private String daily_limit_money;
    @Column(name="delivery_time_type")
    private int delivery_time_type;
    @Column(name="delivery_time")
    private String delivery_time;
    @Column(name="ad_type")
    private int ad_type;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String userId) {
        user_id = userId;
    }

    public String getAdPlanId() {
        return adplan_id;
    }

    public void setAdPlanId(String adPlanId) {
        adplan_id = adPlanId;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getDeliveryType() {
        return delivery_type;
    }

    public void setDeliveryType(int deliveryType) {
        delivery_type = deliveryType;
    }

    public Double getOfferPrice() {
        return offer_price;
    }

    public void setOfferPrice(Double offerPrice) {
        offer_price = offerPrice;
    }

    public String getTelecomOperator() {
        return telecom_operator;
    }

    public void setTelecomOperator(String telecomOperator) {
        telecom_operator = telecomOperator;
    }

    public String getNetworkType() {
        return network_type;
    }

    public void setNetworkType(String networkType) {
        network_type = networkType;
    }

    public String getOperateSystem() {
        return operate_system;
    }

    public void setOperateSystem(String operateSystem) {
        operate_system = operateSystem;
    }

    public String getPdbPlatform() {
        return pdb_platform;
    }

    public void setPdbPlatform(String pdbPlatform) {
        pdb_platform = pdbPlatform;
    }

    public int getGenderType() {
        return gender_type;
    }

    public void setGenderType(int genderType) {
        gender_type = genderType;
    }

    public String getLaunchArea() {
        return launch_area;
    }

    public void setLaunchArea(String launchArea) {
        launch_area = launchArea;
    }

    public String getLaunchPeople() {
        return launch_people;
    }

    public void setLaunchPeople(String launchPeople) {
        launch_people = launchPeople;
    }

    public int getDisplayTimes() {
        return display_times;
    }

    public void setDisplayTimes(int displayTimes) {
        display_times = displayTimes;
    }

    public String getLaunchTimeStart() {
        return launch_time_start;
    }

    public void setLaunchTimeStart(String launchTimeStart) {
        launch_time_start = launchTimeStart;
    }

    public String getLaunchTimeEnd() {
        return launch_end_time;
    }

    public void setLaunchTimeEnd(String launchTimeEnd) {
        launch_end_time = launchTimeEnd;
    }

    public String getAdUrl() {
        return ad_url;
    }

    public void setAdUrl(String adUrl) {
        ad_url = adUrl;
    }

    public String getCallbackUrl() {
        return callback_url;
    }

    public void setCallbackUrl(String callbackUrl) {
        callback_url = callbackUrl;
    }

    public String getDailyLimitMoney() {
        return daily_limit_money;
    }

    public void setDailyLimitMoney(String dailyLimitMoney) {
        daily_limit_money = dailyLimitMoney;
    }

    public int getDeliveryTimeType() {
        return delivery_time_type;
    }

    public void setDeliveryTimeType(int deliveryTimeType) {
        delivery_time_type = deliveryTimeType;
    }

    public String getDeliveryTime() {
        return delivery_time;
    }

    public String getAdPlanName() {
        return adplan_name;
    }

    public void setAdPlanName(String adPlanName) {
        adplan_name = adPlanName;
    }

    public void setDeliveryTime(String deliveryTime) {
        delivery_time = deliveryTime;
    }

    public int getAdType() {
        return ad_type;
    }

    public void setAdType(int adType) {
        ad_type = adType;
    }

    public String getAdId() {return ad_id;}

    public void setAdId(String adId) {ad_id = adId;}

}
