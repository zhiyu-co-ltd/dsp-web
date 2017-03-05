package com.zhiyu.service.impl;

import com.zhiyu.mapper.PeopleMapper;
import com.zhiyu.model.People;
import com.zhiyu.model.People;
import com.zhiyu.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> getAll() {
        return peopleMapper.selectAll();
    }
    @Override
    public List<People> findPeopleByParentId(String ParentId) {
        return peopleMapper.findPeopleByParentId(ParentId);
    }

    public People getById(Integer id) {
        return peopleMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        peopleMapper.deleteByPrimaryKey(id);
    }
    public void save(People people) {
        if (people.getId()!=null) {
            peopleMapper.updateByPrimaryKey(people);
        } else {
            peopleMapper.insert(people);
        }
    }

}
