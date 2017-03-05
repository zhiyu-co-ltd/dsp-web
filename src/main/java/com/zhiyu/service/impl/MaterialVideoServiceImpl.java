package com.zhiyu.service.impl;

import com.zhiyu.mapper.MaterialVideoMapper;
import com.zhiyu.model.MaterialVideo;
import com.zhiyu.service.MaterialVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class MaterialVideoServiceImpl implements MaterialVideoService {

    @Autowired
    private MaterialVideoMapper materialVideoMapper;

    public List<MaterialVideo> getAll() {
        return materialVideoMapper.selectAll();
    }
    @Override
    public List<MaterialVideo> findMaterialVideoByAdId(String AdId) {
        return materialVideoMapper.findMaterialVideoByAdId(AdId);
    }

    public MaterialVideo getById(Integer id) {
        return materialVideoMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        materialVideoMapper.deleteByPrimaryKey(id);
    }
    public void save(MaterialVideo materialVideo) {
        if (materialVideo.getId()!=null) {
            materialVideoMapper.updateByPrimaryKey(materialVideo);
        } else {
            materialVideoMapper.insert(materialVideo);
        }
    }

}
