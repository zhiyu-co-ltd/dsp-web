package com.zhiyu.service;

import com.zhiyu.model.People;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface PeopleService {

    public List<People> getAll();

    public  List<People> findPeopleByParentId(String ParentId);

    public People getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(People people) ;
}
