package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_Financial")
public class Financial  extends BaseEntity{

    private String UserId;
    private String Money;
    private String Type;
    private String Description;
    private String createtime;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
