/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.zhiyu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhiyu.mapper.AdPlanMapper;
import com.zhiyu.model.AdPlan;
import com.zhiyu.service.AdPlanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdPlanServiceImpl implements AdPlanService {

    Logger log = Logger.getLogger(AdPlanServiceImpl.class);
    @Autowired
    private AdPlanMapper adPlanMapper;
    @Override
    public  List<AdPlan> findAdPlanByUserId(String userId){
        return adPlanMapper.findAdPlanByUserId(userId);
    }
    @Override
    public  List<AdPlan> findAdPlanByName(String name,String userid){
        return adPlanMapper.findAdPlanByName(name,userid);
    }

    public AdPlan getById(Integer id) {
        return adPlanMapper.findAdPlanById(id.toString());
    }

    public AdPlan findAdPlanByAdPlanId(String AdPlanId) {
        return adPlanMapper.findAdPlanByAdPlanId(AdPlanId);
    }


    public void deleteById(Integer id) {
        adPlanMapper.deleteByPrimaryKey(id);
    }

    public void save(AdPlan adPlan){
        if (adPlan.getId()!=null) {
            adPlanMapper.updateByPrimaryKey(adPlan);
        } else {
            adPlanMapper.insert(adPlan);
        }
    }
}
