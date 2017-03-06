package com.zhiyu.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_User")
public class User extends BaseEntity{
    @Column(name="user_id")
    private String User_Id;//与数据库对应字段名称
    @Column(name="email")
    private String Email;
    @Column(name="qq")
    private String Qq;
    @Column(name="password")
    private String Password;
    @Column(name="name")
    private String Name;
    @Column(name="phone")
    private String Phone;
    @Column(name="weixin")
    private String Weixin;
    @Column(name="type")
    private String Type="0";
    @Column(name="company_type")
    private String CompanyType;
    @Column(name="ad_account_money")
    private String AdAccountMoney="0";
    @Column(name="cost_today")
    private String CostToday="0";
    @Column(name="update_status")
    private int UpdateStatus;
    @Column(name="update_time")
    private String  UpdateTime;


    public String getUserId() {
        return User_Id;
    }

    public void setUser_Id(String userId) {
        User_Id = userId;
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
