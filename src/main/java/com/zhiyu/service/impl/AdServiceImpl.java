package com.zhiyu.service.impl;

import com.zhiyu.mapper.AdMapper;
import com.zhiyu.model.Ad;
import com.zhiyu.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdMapper adMapper;

    public List<Ad> getAll() {
        return adMapper.selectAll();
    }
    @Override
    public List<Ad> findAdByUserId(String UserId) {
        return adMapper.findAdByUserId(UserId);
    }
    @Override
    public List<Ad> findAdByAdPlanId(String AdPlanId) {
        return adMapper.findAdByAdPlanId(AdPlanId);
    }

    @Override
    public List<Ad> findAdByNameAndAdPlanId(String name,String AdPlanId) {
        return adMapper.findAdByNameAndAdPlanId(name,AdPlanId);
    }

    @Override
    public List<Ad> findAdByNameAdUserId(String name,String UserId) {

        return adMapper.findAdByNameAndUserId(name,UserId);
    }

    public Ad getById(Integer id) {
        return adMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        adMapper.deleteByPrimaryKey(id);
    }
    public void save(Ad ad) {
        if (ad.getId()!=null) {
            adMapper.updateByPrimaryKey(ad);
        } else {
            adMapper.insert(ad);
        }
    }

}
