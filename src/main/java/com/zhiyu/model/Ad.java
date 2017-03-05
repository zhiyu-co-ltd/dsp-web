package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/30.
 */
@Table(name="T_Ad")
public class Ad extends BaseEntity{

    private String Name;
    private String UserId;
    private String AdPlanId;
    private int Status;
    private int DeliveryType;
    private Double OfferPrice;
    private int TelecomOperator;
    private int NetworkType;
    private int OperateSystem;
    private String PdbPlatform;
    private int GenderType;
    private String LaunchArea;
    private String LaunchPeople;
    private int DisplayTimes;
    private String LaunchTimeStart;
    private String LaunchTimeEnd;
    private String AdUrl;
    private String CallbackUrl;
    private String DailyLimitMoney;
    private int DeliveryTimeType;
    private String DeliveryTime;
    private int AdType;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getAdPlanId() {
        return AdPlanId;
    }

    public void setAdPlanId(String adPlanId) {
        AdPlanId = adPlanId;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getDeliveryType() {
        return DeliveryType;
    }

    public void setDeliveryType(int deliveryType) {
        DeliveryType = deliveryType;
    }

    public Double getOfferPrice() {
        return OfferPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        OfferPrice = offerPrice;
    }

    public int getTelecomOperator() {
        return TelecomOperator;
    }

    public void setTelecomOperator(int telecomOperator) {
        TelecomOperator = telecomOperator;
    }

    public int getNetworkType() {
        return NetworkType;
    }

    public void setNetworkType(int networkType) {
        NetworkType = networkType;
    }

    public int getOperateSystem() {
        return OperateSystem;
    }

    public void setOperateSystem(int operateSystem) {
        OperateSystem = operateSystem;
    }

    public String getPdbPlatform() {
        return PdbPlatform;
    }

    public void setPdbPlatform(String pdbPlatform) {
        PdbPlatform = pdbPlatform;
    }

    public int getGenderType() {
        return GenderType;
    }

    public void setGenderType(int genderType) {
        GenderType = genderType;
    }

    public String getLaunchArea() {
        return LaunchArea;
    }

    public void setLaunchArea(String launchArea) {
        LaunchArea = launchArea;
    }

    public String getLaunchPeople() {
        return LaunchPeople;
    }

    public void setLaunchPeople(String launchPeople) {
        LaunchPeople = launchPeople;
    }

    public int getDisplayTimes() {
        return DisplayTimes;
    }

    public void setDisplayTimes(int displayTimes) {
        DisplayTimes = displayTimes;
    }

    public String getLaunchTimeStart() {
        return LaunchTimeStart;
    }

    public void setLaunchTimeStart(String launchTimeStart) {
        LaunchTimeStart = launchTimeStart;
    }

    public String getLaunchTimeEnd() {
        return LaunchTimeEnd;
    }

    public void setLaunchTimeEnd(String launchTimeEnd) {
        LaunchTimeEnd = launchTimeEnd;
    }

    public String getAdUrl() {
        return AdUrl;
    }

    public void setAdUrl(String adUrl) {
        AdUrl = adUrl;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        CallbackUrl = callbackUrl;
    }

    public String getDailyLimitMoney() {
        return DailyLimitMoney;
    }

    public void setDailyLimitMoney(String dailyLimitMoney) {
        DailyLimitMoney = dailyLimitMoney;
    }

    public int getDeliveryTimeType() {
        return DeliveryTimeType;
    }

    public void setDeliveryTimeType(int deliveryTimeType) {
        DeliveryTimeType = deliveryTimeType;
    }

    public String getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        DeliveryTime = deliveryTime;
    }

    public int getAdType() {
        return AdType;
    }

    public void setAdType(int adType) {
        AdType = adType;
    }
}
