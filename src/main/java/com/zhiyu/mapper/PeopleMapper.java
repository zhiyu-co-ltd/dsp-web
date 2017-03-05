package com.zhiyu.mapper;

import com.zhiyu.model.People;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface PeopleMapper extends MyMapper<People> {

   List<People>  findPeopleByParentId(@Param("ParentId") String ParentId);

}
