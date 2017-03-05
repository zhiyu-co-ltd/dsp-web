package com.zhiyu.mapper;

import com.zhiyu.model.UserInfoPrivate;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface UserInfoPrivateMapper extends MyMapper<UserInfoPrivate> {

   UserInfoPrivate  findUserInfoPrivateByUserId(@Param("UserId") String UserId);

}
