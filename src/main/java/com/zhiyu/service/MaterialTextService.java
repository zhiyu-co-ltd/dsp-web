package com.zhiyu.service;

import com.zhiyu.model.MaterialText;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialTextService {

    public List<MaterialText> getAll();

    public  List<MaterialText> findMaterialTextByAdId(String AdId);

    public MaterialText getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(MaterialText ad) ;
}
