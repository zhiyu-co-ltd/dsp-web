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

import com.zhiyu.mapper.UserMapper;
import com.zhiyu.model.User;
import com.zhiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService" )
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper UserMapper;

    public List<User> getAll() {
        return UserMapper.selectAll();
    }
    @Override
    public User findUserByEmail(String email) {
        return UserMapper.findUserByEmail(email);
    }

    @Override
    public User findUserByEmailAndPassword(String email,String password) {

        return UserMapper.findUserByEmailAndPassword(email, password);
    }

    public User getById(Integer id) {
        return UserMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        UserMapper.deleteByPrimaryKey(id);
    }
    public void save(User user) {
        if (user.getId()!=null) {
            UserMapper.updateByPrimaryKey(user);
        } else {
            UserMapper.insert(user);
        }
    }
}
