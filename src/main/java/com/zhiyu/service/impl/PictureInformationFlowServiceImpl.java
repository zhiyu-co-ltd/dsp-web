package com.zhiyu.service.impl;

import com.zhiyu.mapper.PictureInformationFlowMapper;
import com.zhiyu.model.PictureInformationFlow;
import com.zhiyu.service.PicturenformationFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class PictureInformationFlowServiceImpl implements PicturenformationFlowService {

    @Autowired
    private PictureInformationFlowMapper pictureInformationFlowMapper;

    public List<PictureInformationFlow> getAll() {
        return pictureInformationFlowMapper.selectAll();
    }
    @Override
    public List<PictureInformationFlow> findPictureInformationFlowByAdId(String AdId) {
        return pictureInformationFlowMapper.findPictureInformationFlowByAdId(AdId);
    }

    public PictureInformationFlow getById(Integer id) {
        return pictureInformationFlowMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        pictureInformationFlowMapper.deleteByPrimaryKey(id);
    }
    public void save(PictureInformationFlow pictureInformationFlow) {
        if (pictureInformationFlow.getId()!=null) {
            pictureInformationFlowMapper.updateByPrimaryKey(pictureInformationFlow);
        } else {
            pictureInformationFlowMapper.insert(pictureInformationFlow);
        }
    }

}
