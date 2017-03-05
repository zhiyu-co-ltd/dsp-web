package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_User_Info_Private")
public class UserInfoPrivate extends BaseEntity{

    private String UserId;
    private String RealName;
    private String AuthenticationType;
    private String AuthenticationNumber;
    private String AuthenticationImage1;
    private String AuthenticationImage2;
    private String PhoneNumber;
    private String Url;
    private String Address;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getAuthenticationType() {
        return AuthenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        AuthenticationType = authenticationType;
    }

    public String getAuthenticationNumber() {
        return AuthenticationNumber;
    }

    public void setAuthenticationNumber(String authenticationNumber) {
        AuthenticationNumber = authenticationNumber;
    }

    public String getAuthenticationImage1() {
        return AuthenticationImage1;
    }

    public void setAuthenticationImage1(String authenticationImage1) {
        AuthenticationImage1 = authenticationImage1;
    }

    public String getAuthenticationImage2() {
        return AuthenticationImage2;
    }

    public void setAuthenticationImage2(String authenticationImage2) {
        AuthenticationImage2 = authenticationImage2;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
