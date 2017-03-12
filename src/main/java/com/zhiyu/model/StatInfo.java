package com.zhiyu.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruce on 2017/3/12.
 */
public class StatInfo {
    private String userEmail;
    private String userName;
    private String userId;
    private List<StatAdInfo> adInfoList= new ArrayList<>();

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<StatAdInfo> getAdInfoList() {
        return adInfoList;
    }

    public void setAdInfoList(List<StatAdInfo> adInfoList) {
        this.adInfoList = adInfoList;
    }
}
