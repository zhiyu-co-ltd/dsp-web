package com.zhiyu.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by bruce on 17/1/2.
 */
public class CommonDao {
    @Autowired
    private SqlSession sqlSession;

    public void query(String sql){
        //sqlSession.select(sql,Map<String,Object>,null);
    }
}
