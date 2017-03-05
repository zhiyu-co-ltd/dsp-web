package com.zhiyu.service;

import com.zhiyu.model.CardInformationFlow;

import java.util.List;

/**
 * Created by zhaojianfan on 17/1/2.
 */
public interface CardInformationFlowService {

    public List<CardInformationFlow> getAll();

    public  List<CardInformationFlow> findCardInformationFlowByAdId(String AdId);

    public CardInformationFlow getById(Integer id) ;

    public void deleteById(Integer id) ;

    public void save(CardInformationFlow cardInformationFlow) ;
}
