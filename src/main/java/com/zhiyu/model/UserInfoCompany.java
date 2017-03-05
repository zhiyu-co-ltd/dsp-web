package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_User_Info_Company")
public class UserInfoCompany extends BaseEntity{

    private String UserId;
    private String CompanyName;
    private String CompanyNumber;
    private String CompanyImage;
    private String CompanyUrl;
    private String CompanyAddress;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyNumber() {
        return CompanyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        CompanyNumber = companyNumber;
    }

    public String getCompanyImage() {
        return CompanyImage;
    }

    public void setCompanyImage(String companyImage) {
        CompanyImage = companyImage;
    }

    public String getCompanyUrl() {
        return CompanyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        CompanyUrl = companyUrl;
    }

    public String getCompanyAddress() {
        return CompanyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        CompanyAddress = companyAddress;
    }
}
