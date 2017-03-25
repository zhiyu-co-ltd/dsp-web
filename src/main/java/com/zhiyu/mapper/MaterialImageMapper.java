package com.zhiyu.mapper;

import com.zhiyu.model.MaterialImage;
import com.zhiyu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface MaterialImageMapper extends MyMapper<MaterialImage> {

   List<MaterialImage>  findMaterialImageByAdId(@Param("AdId") String AdId);

   List<MaterialImage>  findMaterialImageByNameAndAdId(@Param("AdId") String AdId,@Param("name") String name);

   void UpdateStatus(@Param("Status") String Status ,@Param("Id") Integer Id);

   MaterialImage findMaterialImageById(@Param("Id") String Id);

}
