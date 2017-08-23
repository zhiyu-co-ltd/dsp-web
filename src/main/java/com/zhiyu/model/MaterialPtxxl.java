package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_Material_Ptxxl")
public class MaterialPtxxl extends BaseEntity{

    private String Name;
    private String Size;
    private String MaterialId;
    private String AdId;
    private String status;
    private String ContentAd;//广告语
    private String FileAd;//广告语标题
    private String image_url;//物料地址

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getContentAd() {
        return ContentAd;
    }

    public void setContentAd(String contentAd) {
        ContentAd = contentAd;
    }

    public String getFileAd() {
        return FileAd;
    }

    public void setFileAd(String fileAd) {
        FileAd = fileAd;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(String materialId) {
        MaterialId = materialId;
    }

    public String getAdId() {
        return AdId;
    }

    public void setAdId(String adId) {
        AdId = adId;
    }
}
