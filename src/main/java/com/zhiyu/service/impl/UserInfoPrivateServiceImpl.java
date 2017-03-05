package com.zhiyu.service.impl;

import com.zhiyu.mapper.UserInfoPrivateMapper;
import com.zhiyu.model.UserInfoPrivate;
import com.zhiyu.service.UserInfoPrivateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class UserInfoPrivateServiceImpl implements UserInfoPrivateService {

    @Autowired
    private UserInfoPrivateMapper userInfoPrivateMapper;

    public List<UserInfoPrivate> getAll() {
        return userInfoPrivateMapper.selectAll();
    }
    @Override
    public UserInfoPrivate findUserInfoPrivateByUserId(String UserId) {

        return userInfoPrivateMapper.findUserInfoPrivateByUserId(UserId);
    }

    public UserInfoPrivate getById(Integer id) {
        return userInfoPrivateMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        userInfoPrivateMapper.deleteByPrimaryKey(id);
    }
    public void save(UserInfoPrivate userInfoPrivate) {
        if (userInfoPrivate.getId()!=null) {
            userInfoPrivateMapper.updateByPrimaryKey(userInfoPrivate);
        } else {
            userInfoPrivateMapper.insert(userInfoPrivate);
        }
    }

}
