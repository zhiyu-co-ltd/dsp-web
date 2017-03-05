package com.zhiyu.mapper;

import com.zhiyu.model.UserInfoCompany;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface UserInfoCompanyMapper extends MyMapper<UserInfoCompany> {

   UserInfoCompany  findUserInfoCompanyByUserId(@Param("UserId") String UserId);

}
