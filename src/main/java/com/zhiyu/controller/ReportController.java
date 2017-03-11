package com.zhiyu.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by zhaojianfan on 17/3/10.
 */
public class ReportController {

    Logger log = Logger.getLogger(UserController.class);

    @RequestMapping("/guaikuangReport")
    public String login(Map<String, Object> model, HttpServletRequest request) {
        String date_start= request.getParameter("date_start") ;
        String date_end= request.getParameter("date_end") ;
        String type= request.getParameter("type") ;
        String path="";

        return path;
    }
}
