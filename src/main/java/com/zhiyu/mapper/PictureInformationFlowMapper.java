package com.zhiyu.mapper;

import com.zhiyu.model.PictureInformationFlow;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface PictureInformationFlowMapper extends MyMapper<PictureInformationFlow> {

   List<PictureInformationFlow>  findPictureInformationFlowByAdId(@Param("AdId") String AdId);
}
