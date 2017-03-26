package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_Material_Image")
public class MaterialImage extends BaseEntity {

    private String Name;
    private String ad_id;
    private String material_id;
    private String Size;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String image_url;
    private String status;
    private int type;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdId() {
        return ad_id;
    }

    public void setAdId(String adId) {
        ad_id = adId;
    }

    public String getMaterialId() {
        return material_id;
    }

    public void setMaterialId(String materialId) {
        material_id = materialId;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String imageUrl) {
        image_url = imageUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
