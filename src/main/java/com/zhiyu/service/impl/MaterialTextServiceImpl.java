package com.zhiyu.service.impl;

import com.zhiyu.mapper.MaterialTextMapper;
import com.zhiyu.model.MaterialText;
import com.zhiyu.service.MaterialTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class MaterialTextServiceImpl implements MaterialTextService {

    @Autowired
    private MaterialTextMapper materialTextMapper;

    public List<MaterialText> getAll() {
        return materialTextMapper.selectAll();
    }
    @Override
    public List<MaterialText> findMaterialTextByAdId(String AdId) {
        return materialTextMapper.findMaterialTextByAdId(AdId);
    }

    public MaterialText getById(Integer id) {
        return materialTextMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        materialTextMapper.deleteByPrimaryKey(id);
    }
    public void save(MaterialText materialText) {
        if (materialText.getId()!=null) {
            materialTextMapper.updateByPrimaryKey(materialText);
        } else {
            materialTextMapper.insert(materialText);
        }
    }

}
