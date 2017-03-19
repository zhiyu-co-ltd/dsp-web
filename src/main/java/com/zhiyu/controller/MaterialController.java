package com.zhiyu.controller;

import com.zhiyu.model.Ad;
import com.zhiyu.model.User;
import com.zhiyu.service.AdService;
import com.zhiyu.service.UserService;
import com.zhiyu.util.DateUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaojianfan on 17/3/12.
 */
@Controller
public class MaterialController {

    Logger log = Logger.getLogger(MaterialController.class);

    @Autowired
    private AdService adService;
    @Autowired
    private UserService userService;


//    @RequestMapping("/addAd")
//    public String addAd(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {
//
//        String adplanname = request.getParameter("adplanname") ;
//        String userid = request.getParameter("userid");
//        String dayconst = request.getParameter("daycost");
//
//        AdPlan adPlan = new AdPlan();
//        adPlan.setName(adplanname);
//        adPlan.setUserId(userid);
//        adPlan.setAdplanId(MyUUID.getUUID());
//        adPlan.setDayConst(dayconst);
//        adPlan.setStatus("1");
//        adPlan.setRealtimeMoney("0.00");
//        adPlanService.save(adPlan);
//        User user =  userService.findUserByUserId(userid);
//        model.put("loginStatus", "true");
//        model.put("userName", user.getName());
//        model.put("userId", userid);
//        log.info("---userid="+model.get("userId"));
//        model.put("day", DateUtil.getDay());
//        Cookie Usercookie = new Cookie("userId",userid);
//        Usercookie.setMaxAge(60*60*24*7);//保留7天
//        response.addCookie(Usercookie);
//        log.info("adplanname="+adplanname+";userid="+userid+";dayconst="+dayconst);
//
//        return "tuiguang";
//    }
    @RequestMapping("/findMaterialByName")
    public String findMaterialByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
           adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
           log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "guangao_con";
    }
    @RequestMapping("/findMaterialWenZiByName")
    public String findMaterialWenZiByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
            adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "ggcon_wenzi";
    }

    @RequestMapping("/findMaterialKpByName")
    public String findMaterialKpByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
            adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "ggcon_kpxxl";
    }

    @RequestMapping("/findMaterialPtByName")
    public String findMaterialPtByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
            adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "ggcon_ptxxl";
    }
    @RequestMapping("/findMaterialThreehByName")
    public String findMaterialThreehByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
            adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "ggcon_threeh";
    }
    @RequestMapping("/findMaterialTwohByName")
    public String findMaterialTwohByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
            adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "ggcon_twoh";
    }

    @RequestMapping("/findMaterialYhByName")
    public String findMaterialYhByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

        String adname = request.getParameter("adname") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adname="+adname+";userid="+userid+";adplanid="+adplanid);
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)) {
            adList = adService.findAdByNameAdUserId(adname, userid);
        }else{
            adList = adService.findAdByNameAndAdPlanId(adname, adplanid);
        }
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId());
        }
        User user =  userService.findUserByUserId(userid);
        model.put("loginStatus", "true");
        model.put("userName", user.getName());
        model.put("userId", userid);
        log.info("---userid="+model.get("userId"));
        model.put("day", DateUtil.getDay());
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "ggcon_yh";
    }
}
