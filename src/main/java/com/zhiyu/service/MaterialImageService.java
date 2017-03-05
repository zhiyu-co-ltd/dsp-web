package com.zhiyu.service;

import com.zhiyu.model.MaterialImage;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialImageService {

    public List<MaterialImage> getAll();

    public  List<MaterialImage> findMaterialImageByAdId(String AdId);

    public MaterialImage getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(MaterialImage materialImage) ;
}
