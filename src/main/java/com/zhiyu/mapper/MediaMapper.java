package com.zhiyu.mapper;

import com.zhiyu.model.Media;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MediaMapper extends MyMapper<Media> {

    List<Media>  getAll();

}
