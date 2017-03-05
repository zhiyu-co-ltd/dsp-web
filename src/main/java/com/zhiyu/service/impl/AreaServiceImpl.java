package com.zhiyu.service.impl;

import com.zhiyu.mapper.AreaMapper;
import com.zhiyu.model.Area;
import com.zhiyu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public List<Area> getAll() {
        return areaMapper.selectAll();
    }
    @Override
    public List<Area> findAreaByParentId(String ParentId) {
        return areaMapper.findAreaByParentId(ParentId);
    }

    public Area getById(Integer id) {
        return areaMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        areaMapper.deleteByPrimaryKey(id);
    }
    public void save(Area area) {
        if (area.getId()!=null) {
            areaMapper.updateByPrimaryKey(area);
        } else {
            areaMapper.insert(area);
        }
    }

}
