package com.zhiyu.mapper;

import com.zhiyu.model.Area;
import com.zhiyu.util.MyMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface AreaMapper extends MyMapper<Area> {

   List<Area>  findAreaByParentId(@Param("ParentId") String ParentId);

}
