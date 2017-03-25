package com.zhiyu.model;

import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_Material_Image")
public class MaterialImage extends BaseEntity {

    private String Name;
    private String AdId;
    private String material_id;
    private String Size;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String ImageUrl;
    private String status;
    private int type;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdId() {
        return AdId;
    }

    public void setAdId(String adId) {
        AdId = adId;
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
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
