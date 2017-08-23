package com.zhiyu.service.impl;

import com.zhiyu.mapper.MaterialPtxxlMapper;
import com.zhiyu.model.MaterialPtxxl;
import com.zhiyu.service.MaterialPtxxlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class MaterialPtxxlServiceImpl implements MaterialPtxxlService {

    @Autowired
    private MaterialPtxxlMapper materialPtxxlMapper;

    public List<MaterialPtxxl> getAll() {
        return materialPtxxlMapper.selectAll();
    }
    @Override
    public List<MaterialPtxxl> findMaterialPtxxlByAdId(String AdId) {
        return materialPtxxlMapper.findMaterialPtxxlByAdId(AdId);
    }

    public MaterialPtxxl getById(Integer id) {
        return materialPtxxlMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        materialPtxxlMapper.deleteByPrimaryKey(id);
    }
    public void save(MaterialPtxxl materialPtxxl) {
        if (materialPtxxl.getId()!=null) {
            materialPtxxlMapper.updateByPrimaryKey(materialPtxxl);
        } else {
            materialPtxxlMapper.insert(materialPtxxl);
        }
    }

}
