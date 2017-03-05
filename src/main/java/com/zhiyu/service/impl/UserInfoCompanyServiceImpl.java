package com.zhiyu.service.impl;

import com.zhiyu.mapper.UserInfoCompanyMapper;
import com.zhiyu.model.UserInfoCompany;
import com.zhiyu.service.UserInfoCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class UserInfoCompanyServiceImpl implements UserInfoCompanyService {

    @Autowired
    private UserInfoCompanyMapper userInfoCompanyMapper;

    public List<UserInfoCompany> getAll() {
        return userInfoCompanyMapper.selectAll();
    }
    @Override
    public UserInfoCompany findUserInfoCompanyByUserId(String UserId) {

        return userInfoCompanyMapper.findUserInfoCompanyByUserId(UserId);
    }

    public UserInfoCompany getById(Integer id) {
        return userInfoCompanyMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        userInfoCompanyMapper.deleteByPrimaryKey(id);
    }
    public void save(UserInfoCompany userInfoCompany) {
        if (userInfoCompany.getId()!=null) {
            userInfoCompanyMapper.updateByPrimaryKey(userInfoCompany);
        } else {
            userInfoCompanyMapper.insert(userInfoCompany);
        }
    }

}
