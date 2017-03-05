package com.zhiyu.mapper;

import com.zhiyu.model.MaterialText;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialTextMapper extends MyMapper<MaterialText> {

   List<MaterialText>  findMaterialTextByAdId(@Param("AdId") String AdId);
}
