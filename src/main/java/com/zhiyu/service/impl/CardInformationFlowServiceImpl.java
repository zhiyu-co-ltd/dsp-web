package com.zhiyu.service.impl;

import com.zhiyu.mapper.CardInformationFlowMapper;
import com.zhiyu.model.CardInformationFlow;
import com.zhiyu.service.CardInformationFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
@Service
public class CardInformationFlowServiceImpl implements CardInformationFlowService {

    @Autowired
    private CardInformationFlowMapper cardInformationFlowMapper;

    public List<CardInformationFlow> getAll() {
        return cardInformationFlowMapper.selectAll();
    }
    @Override
    public List<CardInformationFlow> findCardInformationFlowByAdId(String AdId) {
        return cardInformationFlowMapper.findCardInformationFlowByAdId(AdId);
    }

    public CardInformationFlow getById(Integer id) {
        return cardInformationFlowMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {

        cardInformationFlowMapper.deleteByPrimaryKey(id);
    }
    public void save(CardInformationFlow cardInformationFlow) {
        if (cardInformationFlow.getId()!=null) {
            cardInformationFlowMapper.updateByPrimaryKey(cardInformationFlow);
        } else {
            cardInformationFlowMapper.insert(cardInformationFlow);
        }
    }

}
