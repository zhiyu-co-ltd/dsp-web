package com.zhiyu.mapper;

import com.zhiyu.model.MaterialPtxxl;
import com.zhiyu.model.MaterialText;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialPtxxlMapper extends MyMapper<MaterialPtxxl> {

   List<MaterialPtxxl>  findMaterialPtxxlByAdId(@Param("AdId") String AdId);
}
