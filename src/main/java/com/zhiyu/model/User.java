package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_User")
public class User extends BaseEntity{

    private String UserId;
    private String Email;
    private String Qq;
    private String Password;
    private String Name;
    private String Phone;
    private String Weixin;
    private String Type="0";
    private String CompanyType;
    private String AdAccountMoney="0";
    private String CostToday="0";
    private int UpdateStatus;
    private String  UpdateTime;


    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getQq() {
        return Qq;
    }

    public void setQq(String Qq) {
        this.Qq= Qq;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getWeixin() {
        return Weixin;
    }

    public void setWeixin(String weixin) {
        Weixin = weixin;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCompanyType() {
        return CompanyType;
    }

    public void setCompanyType(String companyType) {
        CompanyType = companyType;
    }

    public String getAdAccountMoney() {
        return AdAccountMoney;
    }

    public void setAdAccountMoney(String adAccountMoney) {
        AdAccountMoney = adAccountMoney;
    }

    public String getCostToday() {
        return CostToday;
    }

    public void setCostToday(String costToday) {
        CostToday = costToday;
    }

    public int getUpdateStatus() {
        return UpdateStatus;
    }

    public void setUpdateStatus(int updateStatus) {
        UpdateStatus = updateStatus;
    }

    public String getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(String updateTime) {
        UpdateTime = updateTime;
    }
}
