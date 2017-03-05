package com.zhiyu.service;

import com.zhiyu.model.MaterialVideo;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialVideoService {

    public List<MaterialVideo> getAll();

    public  List<MaterialVideo> findMaterialVideoByAdId(String AdId);

    public MaterialVideo getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(MaterialVideo materialVideo) ;
}
