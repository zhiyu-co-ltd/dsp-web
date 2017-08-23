package com.zhiyu.service;

import com.zhiyu.model.MaterialPtxxl;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialPtxxlService {

    public List<MaterialPtxxl> getAll();

    public  List<MaterialPtxxl> findMaterialPtxxlByAdId(String AdId);

    public MaterialPtxxl getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(MaterialPtxxl ad) ;
}
