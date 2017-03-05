package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_People")
public class People extends BaseEntity{

    private String name;
    private String PeopleId;
    private String ParentsId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeopleId() {
        return PeopleId;
    }

    public void setPeopleId(String peopleId) {
        PeopleId = peopleId;
    }

    public String getParentsId() {
        return ParentsId;
    }

    public void setParentsId(String parentsId) {
        ParentsId = parentsId;
    }
}
