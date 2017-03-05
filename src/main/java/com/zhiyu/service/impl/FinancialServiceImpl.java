package com.zhiyu.service.impl;

import com.zhiyu.mapper.FinancialMapper;
import com.zhiyu.model.Financial;
import com.zhiyu.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class FinancialServiceImpl implements FinancialService {

    @Autowired
    private FinancialMapper financialMapper;

    public List<Financial> getAll() {
        return financialMapper.selectAll();
    }
    @Override
    public List<Financial> findFinancialByUserId(String UserId) {
        return financialMapper.findFinancialByUserId(UserId);
    }

    public Financial getById(Integer id) {
        return financialMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        financialMapper.deleteByPrimaryKey(id);
    }
    public void save(Financial financial) {
        if (financial.getId()!=null) {
            financialMapper.updateByPrimaryKey(financial);
        } else {
            financialMapper.insert(financial);
        }
    }

}
