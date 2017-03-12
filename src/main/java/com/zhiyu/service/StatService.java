package com.zhiyu.service;

import com.zhiyu.model.StatInfo;

/**
 * Created by bruce on 2017/3/12.
 */
public interface StatService {


     StatInfo getUserAdInfo(String userEmail,int startDay,int endDay) ;

}
