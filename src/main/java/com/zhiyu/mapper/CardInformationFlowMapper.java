package com.zhiyu.mapper;

import com.zhiyu.model.CardInformationFlow;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface CardInformationFlowMapper extends MyMapper<CardInformationFlow> {

   List<CardInformationFlow>  findCardInformationFlowByAdId(@Param("AdId") String AdId);
}
