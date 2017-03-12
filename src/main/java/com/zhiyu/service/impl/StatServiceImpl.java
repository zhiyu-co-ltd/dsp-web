package com.zhiyu.service.impl;

import com.zhiyu.model.StatAdInfo;
import com.zhiyu.model.StatInfo;
import com.zhiyu.service.StatService;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruce on 2017/3/12.
 */
@Service
public class StatServiceImpl implements StatService {
    Logger log = Logger.getLogger(StatServiceImpl.class);
    @Autowired
    private SqlSession sqlSession;

    @Override
    public StatInfo getUserAdInfo(String userId, int startDay ,int endDay) {
        String sql="select  T1.user_id,T2.day,sum(T2.pv) as pv,sum(T2.clk) as clk,sum(T2.inst) as inst,sum(T2.cost) as cost  from t_stat_ad_relation  T1  JOIN  T_Stat_Gather_Info T2" +
                " on T1.ad_id = T2.aid where T1.user_id=? and T2.day>=?  and T2.day<=? group by T1.user_id,T2.day ";
        log.info(">>>>>>>>>>>>>"+sql);
        StatInfo statInfo = new StatInfo();
        statInfo.setUserId(userId);
        List<StatAdInfo> adInfoList = statInfo.getAdInfoList();
        try {
            //sqlSession.selectMap();

        Connection conn = sqlSession.getConfiguration().getEnvironment().getDataSource().getConnection();

            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,userId);
            stmt.setInt(2,startDay);
            stmt.setInt(3,endDay);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                StatAdInfo adInfo = new StatAdInfo();
                adInfo.setDay(rs.getString("day"));
                adInfo.setPv(rs.getInt("pv"));
                adInfo.setClk(rs.getInt("clk"));
                adInfo.setInst(rs.getInt("inst"));
                adInfo.setCost(rs.getBigDecimal("cost"));
                adInfoList.add(adInfo);

                //System.out.println(">>>>>>>>>>>"+rs.getString(1));
            }

        } catch (SQLException e) {
            log.error(sql);
            e.printStackTrace();
        }
        return statInfo;
    }
}
