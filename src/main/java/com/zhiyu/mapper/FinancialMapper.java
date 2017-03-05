package com.zhiyu.mapper;

import com.zhiyu.model.Financial;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface FinancialMapper extends MyMapper<Financial> {

   List<Financial>  findFinancialByUserId(@Param("UserId") String UserId);

}
