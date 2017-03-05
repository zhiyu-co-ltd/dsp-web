package com.zhiyu.mapper;

import com.zhiyu.model.MaterialVideo;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialVideoMapper extends MyMapper<MaterialVideo> {

   List<MaterialVideo>  findMaterialVideoByAdId(@Param("AdId") String AdId);
}
