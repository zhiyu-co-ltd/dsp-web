package com.zhiyu.controller;

import com.zhiyu.model.Ad;
import com.zhiyu.model.AdPlan;
import com.zhiyu.model.BaseEntity;
import com.zhiyu.model.User;
import com.zhiyu.service.AdService;
import com.zhiyu.service.AdPlanService;
import com.zhiyu.service.UserService;
import com.zhiyu.util.DateUtil;
import com.zhiyu.util.MyUUID;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaojianfan on 17/3/12.
 */
@Controller
public class AdController {

    Logger log = Logger.getLogger(AdController.class);

    @Autowired
    private AdService adService;
    @Autowired
    private AdPlanService adPlanService;
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
    @RequestMapping("/findAdByName")
    public String findAdByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "guanggao";
    }

    @ResponseBody
    @RequestMapping("/updateAdStatus")
    public Ad updateAdStatus(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) {

        String adid  = request.getParameter("adid") ;
        String adstatus = request.getParameter("adstatus") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");

        log.info("adid="+adid+";adstatus="+adstatus+";userid="+userid+";adplanid="+adplanid);

        if(adstatus.equals("0")){
            adstatus="1";
        }
        else if(adstatus.equals("2")){
            adstatus="5";
        } else if(adstatus.equals("3")){
            adstatus="1";
        } else if(adstatus.equals("4")){
            adstatus="5";
        } else if(adstatus.equals("5")){
            adstatus="6";
        } else if(adstatus.equals("6")){
            adstatus="4";
        } else if(adstatus.equals("7")){
            adstatus="8";
        }

        adService.updateStatus(adstatus,Integer.parseInt(adid));

        Ad ad= adService.getById(Integer.parseInt(adid));

        log.info("ad="+ad);

        return ad;
    }

    @ResponseBody
    @RequestMapping("/UpdateAd")
    public Ad updateAd(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) {

        String adid  = request.getParameter("adid") ;
        String displaytimes = request.getParameter("displaytimes") ;
        String daycost = request.getParameter("daycost");
        String adname = request.getParameter("adname");
        String adprice = request.getParameter("adprice");

        log.info("adid="+adid+";displaytimes="+displaytimes+";daycost="+daycost+";adname="+adname+";adprice="+adprice);

        Ad ad= adService.getByAdId(adid);
        ad.setDisplayTimes(Integer.parseInt(displaytimes));
        ad.setDailyLimitMoney(daycost);
        ad.setName(adname);
        ad.setOfferPrice(new Double(adprice));
        adService.save(ad);
        ad=adService.getByAdId(adid);

        log.info("ad="+ad);

        return ad;
    }

    @ResponseBody
    @RequestMapping("/saveAd")
    public Ad saveAd(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) {

        String adid  = request.getParameter("adid") ;
        String userid  = request.getParameter("userid") ;
        String displaytimes = request.getParameter("displaytimes") ;
        String daycost = request.getParameter("dayconst");
        String adname = request.getParameter("adname");
        String adprice = request.getParameter("adprice");
        String adplanid = request.getParameter("adplanid");
        String startdate = request.getParameter("startdate");
        String enddate = request.getParameter("enddate");
        String adurl = request.getParameter("adurl");
        String callback_url = request.getParameter("callback_url");

        log.info("adid="+adid+";displaytimes="+displaytimes+";daycost="+daycost+";adname="+adname+";adprice="+adprice+
                ";adplanid="+adplanid+";startdate="+startdate+";enddate="+enddate+";adurl="+adurl+";callback_url="+callback_url
        );
        Ad ad=null;
        if(adid!=null&&!"".equals(adid)) {
             ad = adService.getByAdId(adid);
        }else{
            ad=new Ad();
            ad.setAdId(MyUUID.getUUID());
        }
        ad.setUserId(userid);
        ad.setDisplayTimes(Integer.parseInt(displaytimes));
        ad.setDailyLimitMoney(daycost);
        ad.setName(adname);
        //ad.setOfferPrice(new Double(adprice));
        ad.setAdPlanId(adplanid);
        ad.setAdUrl(adurl);
        ad.setLaunchTimeStart(startdate);
        ad.setLaunchTimeEnd(enddate);
        ad.setCallbackUrl(callback_url);
        AdPlan adPlan=adPlanService.findAdPlanByAdPlanId(adplanid);
        ad.setAdPlanName(adPlan.getName());

        adService.save(ad);
        ad=adService.getByAdId(ad.getAdId());

        log.info("ad="+ad);
        log.info("adid="+ad.getAdId()+";name="+ad.getName());

        return ad;
    }
}
