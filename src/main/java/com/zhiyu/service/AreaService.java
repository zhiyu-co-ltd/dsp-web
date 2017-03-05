package com.zhiyu.service;

import com.zhiyu.model.Area;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface AreaService {

    public List<Area> getAll();

    public  List<Area> findAreaByParentId(String ParentId);

    public Area getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(Area area) ;
}
