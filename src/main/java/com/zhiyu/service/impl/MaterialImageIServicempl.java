package com.zhiyu.service.impl;

import com.zhiyu.mapper.MaterialImageMapper;
import com.zhiyu.model.MaterialImage;
import com.zhiyu.service.MaterialImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class MaterialImageIServicempl implements MaterialImageService {

    @Autowired
    private MaterialImageMapper materialImageMapper;

    public List<MaterialImage> getAll() {
        return materialImageMapper.selectAll();
    }
    @Override
    public List<MaterialImage> findMaterialImageByAdId(String AdId) {
        return materialImageMapper.findMaterialImageByAdId(AdId);
    }

    public MaterialImage getById(Integer id) {
        return materialImageMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        materialImageMapper.deleteByPrimaryKey(id);
    }
    public void save(MaterialImage materialImage) {
        if (materialImage.getId()!=null) {
            materialImageMapper.updateByPrimaryKey(materialImage);
        } else {
            materialImageMapper.insert(materialImage);
        }
    }

}
