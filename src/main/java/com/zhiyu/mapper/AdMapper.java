package com.zhiyu.mapper;

import com.zhiyu.model.Ad;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface AdMapper extends MyMapper<Ad> {

   List<Ad>  findAdByUserId(@Param("UserId") String UserId);

   List<Ad>  findAdByAdPlanId(@Param("AdPlanId") String AdPlanId);

   List<Ad>  findAdByNameAndAdPlanId(@Param("AdPlanId") String AdPlanId,@Param("name") String name);

   List<Ad>  findAdByNameAndUserId(@Param("name") String name,@Param("UserId") String UserId);

}
