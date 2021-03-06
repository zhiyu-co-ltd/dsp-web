package com.zhiyu.controller;

import com.zhiyu.model.Ad;
import com.zhiyu.model.AdPlan;
import com.zhiyu.model.User;
import com.zhiyu.service.AdPlanService;
import com.zhiyu.service.UserService;
import com.zhiyu.util.DateUtil;
import com.zhiyu.util.MyUUID;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.image.IntegerComponentRaster;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaojianfan on 17/3/12.
 */
@Controller
public class AdPlanController {

    Logger log = Logger.getLogger(AdPlanController.class);

    @Autowired
    private AdPlanService adPlanService;
    @Autowired
    private UserService userService;


    @RequestMapping("/addAdPlan")
    public String addAdPlan(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adplanid  = request.getParameter("adplanid") ;
        String adplanname = request.getParameter("adplanname") ;
        String userid = request.getParameter("userid");
        String dayconst = request.getParameter("daycost");

        AdPlan adPlan = null;
        log.info("---adplanid="+adplanid);
        if(adplanid!=null&&!"".equals(adplanid)){
            adPlan=adPlanService.getById(Integer.parseInt(adplanid));
            log.info("---adPlan="+adPlan.toString());
            log.info("---id="+adPlan.getId()+";name="+adPlan.getName()+";datcost="+adPlan.getDayConst()+";status="+adPlan.getStatus()
                    +";userid="+ adPlan.getUserId()+";realtimemoney="+ adPlan.getRealtimeMoney());
            adPlan.setName(adplanname);
            adPlan.setDayConst(dayconst);
            log.info("---userid="+adPlan.getUserId());
        }else {
            adPlan=new AdPlan();
            adPlan.setName(adplanname);
            adPlan.setUserId(userid);
            adPlan.setAdplanId(MyUUID.getUUID());
            adPlan.setDayConst(dayconst);
            adPlan.setStatus("1");
            adPlan.setRealtimeMoney("0.00");
        }
        adPlanService.save(adPlan);
        List<AdPlan> adPlanList=adPlanService.findAdPlanByUserId(userid);

        model.put("adPlanList", adPlanList);
        log.info("size="+adPlanList.size());

        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        log.info("adplanname="+adplanname+";userid="+userid+";dayconst="+dayconst);

        return "tuiguang";
    }
    @RequestMapping("/findAdPlanByName")
    public String findAdPlanByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adplanname = request.getParameter("adplanname") ;
        String userid = request.getParameter("userid");

        log.info("adplanname="+adplanname+";userid="+userid);
        List<AdPlan> adPlanList=adPlanService.findAdPlanByName(adplanname,userid);
        log.info("size="+adPlanList.size());
        User user =  userService.findUserByUserId(userid);

        model.put("adPlanList", adPlanList);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "tuiguang";
    }
    @ResponseBody
    @RequestMapping("/updateAdPlanStatus")
    public AdPlan updateAdPlanStatus(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adplanid  = request.getParameter("adplanid") ;
        String adplanstatus = request.getParameter("adplanstatus") ;
        String userid = request.getParameter("userid");
        if(adplanstatus.equals("0")){
            adplanstatus="1";
        }
        else if(adplanstatus.equals("1")){
            adplanstatus="0";
        }

        log.info("adplanid="+adplanid+";adplanstatus="+adplanstatus+";userid="+userid);

        adPlanService.updateStatus(adplanstatus,Integer.parseInt(adplanid));

        AdPlan adPlan=adPlanService.getById(Integer.parseInt(adplanid));

        return adPlan;
    }

}
