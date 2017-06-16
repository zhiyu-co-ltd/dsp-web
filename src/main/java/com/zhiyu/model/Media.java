package com.zhiyu.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_Media")
public class Media extends BaseEntity{

    private String name;
    @Column(name="media_id")
    private String media_id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMediaId() {
        return media_id;
    }

    public void setMediaId(String mediaId) {
        mediaId = media_id;
    }

}
