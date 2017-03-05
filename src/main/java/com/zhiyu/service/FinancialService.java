package com.zhiyu.service;

import com.zhiyu.model.Financial;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface FinancialService {

    public List<Financial> getAll();

    public  List<Financial> findFinancialByUserId(String UserId);

    public Financial getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(Financial financial) ;
}
