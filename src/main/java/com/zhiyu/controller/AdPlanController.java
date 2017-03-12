package com.zhiyu.controller;

import com.zhiyu.model.AdPlan;
import com.zhiyu.service.AdPlanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by zhaojianfan on 17/3/12.
 */
@Controller
public class AdPlanController {

    Logger log = Logger.getLogger(UserController.class);

    @Autowired
    private AdPlanService adPlanService;

    @RequestMapping("/addAdPlan")
    public String addAdPlan(Map<String, Object> model, HttpServletRequest request) {

        String name = request.getParameter("name") ;
        String userid = request.getParameter("userid");
        String dayconst = request.getParameter("daycost");

        log.info("name="+name+";userid="+userid+";dayconst="+dayconst);

        return "tuiguang";
    }


}
