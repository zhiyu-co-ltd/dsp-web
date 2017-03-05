package com.zhiyu.service;

import com.zhiyu.model.UserInfoPrivate;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface UserInfoPrivateService {

    public List<UserInfoPrivate> getAll();

    public  UserInfoPrivate findUserInfoPrivateByUserId(String UserId);

    public UserInfoPrivate getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(UserInfoPrivate userInfoPrivate) ;
}
