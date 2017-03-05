package com.zhiyu.service;

import com.zhiyu.model.PictureInformationFlow;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface PicturenformationFlowService {

    public List<PictureInformationFlow> getAll();

    public  List<PictureInformationFlow> findPictureInformationFlowByAdId(String AdId);

    public PictureInformationFlow getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(PictureInformationFlow pictureInformationFlow) ;
}
