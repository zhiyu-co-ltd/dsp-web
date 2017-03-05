package com.zhiyu.service;

import com.zhiyu.model.UserInfoCompany;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface UserInfoCompanyService {

    public List<UserInfoCompany> getAll();

    public  UserInfoCompany findUserInfoCompanyByUserId(String UserId);

    public UserInfoCompany getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(UserInfoCompany userInfoCompany) ;
}
