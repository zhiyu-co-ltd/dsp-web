package com.zhiyu.util;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * Created by zhaojianfan on 17/3/10.
 */
public class DateUtil {

    public static String getLastDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); //得到前一天
        Date date = calendar.getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(date);
    }
    public static String getDay() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(date);
    }
    /**
      * 获取过去第几天的日期
      *
      * @param past
      * @return
    */
 public static String getPastDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String result = format.format(today);
          return result;
       }
    public static void main(String[] args) {

        System.out.println(DateUtil.getPastDate(30));
    }

}
