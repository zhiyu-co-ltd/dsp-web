package com.zhiyu.service;

import com.zhiyu.model.Ad;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface AdService {

    public List<Ad> getAll();

    public  List<Ad> findAdByUserId(String UserId);

    public  List<Ad> findAdByAdPlanId(String AdPlanId);

    public  List<Ad> findAdByNameAdUserId(String name,String UserId);

    public  List<Ad> findAdByNameAndAdPlanId(String name,String AdPlanId);

    public Ad getById(Integer id) ;

    public Ad getByAdId(String adid) ;

    public void deleteById(Integer id) ;

    public void updateStatus(String staus,Integer id) ;

    public void save(Ad ad) ;
}
