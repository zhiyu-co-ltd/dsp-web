package com.zhiyu.controller;

import com.zhiyu.model.*;
import com.zhiyu.service.*;
import com.zhiyu.util.DateUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
class WelcomeController {
    Logger log = Logger.getLogger(WelcomeController.class);

	@Autowired
	private UserService userService;

    @Autowired
    private AdPlanService adPlanService;

    @Autowired
    private MaterialImageService materialImageService;

    @Autowired
    private AdService adService;

    @Autowired
    private FinancialService financialService;

    @Autowired
    private MediaService mediaService;


    @RequestMapping("/index")
	public String welcome(Map<String, Object> model,HttpServletRequest request) {

		Cookie[] cookie = request.getCookies();
		if(cookie!=null) {
			for (int i = 0; i < cookie.length; i++) {
				Cookie cook = cookie[i];
				if (cook.getName().equalsIgnoreCase("userId")) { //获取键
					String userId = cook.getValue().toString();
					User user = userService.findUserByUserId(userId);
					model.put("loginStatus", "true");
					model.put("userName", user.getName());
					break;
				}
			}
		}

		return "index";
	}
	@RequestMapping("/ad")
	public String ad(Map<String, Object> model,HttpServletRequest request) {
		Cookie[] cookie = request.getCookies();
		if(cookie!=null) {
			for (int i = 0; i < cookie.length; i++) {
				Cookie cook = cookie[i];
				if (cook.getName().equalsIgnoreCase("userId")) { //获取键
					String userId = cook.getValue().toString();
					User user = userService.findUserByUserId(userId);
					model.put("loginStatus", "true");
					model.put("userName", user.getName());
					break;
				}
			}
		}
		return "ad";
	}

	@RequestMapping("/feed")
	public String feed(Map<String, Object> model,HttpServletRequest request) {
		Cookie[] cookie = request.getCookies();
		if(cookie!=null) {
			for (int i = 0; i < cookie.length; i++) {
				Cookie cook = cookie[i];
				if (cook.getName().equalsIgnoreCase("userId")) { //获取键
					String userId = cook.getValue().toString();
					User user = userService.findUserByUserId(userId);
					model.put("loginStatus", "true");
					model.put("userName", user.getName());
					break;
				}
			}
		}
		return "feed";
	}
	@RequestMapping("/about")
	public String about(Map<String, Object> model,HttpServletRequest request) {
		Cookie[] cookie = request.getCookies();
		if(cookie!=null) {
			for (int i = 0; i < cookie.length; i++) {
				Cookie cook = cookie[i];
				if (cook.getName().equalsIgnoreCase("userId")) { //获取键
					String userId = cook.getValue().toString();
					User user = userService.findUserByUserId(userId);
					model.put("loginStatus", "true");
					model.put("userName", user.getName());
					break;
				}
			}
		}
		return "about";
	}
	@RequestMapping("/gaikuang")
	public String gaikuang(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    log.info("---userid="+model.get("userId"));
                    model.put("ad_account_money", "999932");
                    model.put("cost_today", "3241999");
                    model.put("pv", "212111111");
                    model.put("download", "2121111112");
                    model.put("click", "2121111113");
                    model.put("cost", "9899");
                    model.put("Unaudited", "12");
                    model.put("Delivery", "4");
                    model.put("NotPass", "12");
                    model.put("daily_limit_money", "2000000");
                    model.put("Average_click_rate", "90");
                    model.put("Average_download_conversion_rate", "65");
                    model.put("Click_average_price", "2.5");
                    model.put("Download_average_price", "6.0");
                    model.put("time", DateUtil.getLastDay()+" 23:59:59");
                    model.put("day", DateUtil.getDay());
                    returnUrl="gaikuang";
                    break;
                }
            }
        }
            return returnUrl;
	}
    @RequestMapping("/tuiguang")
    public String tuiguang(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String userId="";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    log.info("---userid="+model.get("userId"));
                    model.put("day", DateUtil.getDay());
                    returnUrl="tuiguang";
                    break;
                }
            }
        }
        List<AdPlan> adPlanList=adPlanService.findAdPlanByUserId(userId);
        model.put("adPlanList", adPlanList);
        log.info("size="+adPlanList.size());
        for(int i=0;i<adPlanList.size();i++){
            AdPlan adPlan=(AdPlan)adPlanList.toArray()[i];
            log.info("name="+adPlan.getName()+";id="+adPlan.getId()+"adplanid="+adPlan.getAdplanId()+"userid="+adPlan.getUserId());
        }
        return returnUrl;
    }
    @RequestMapping("/guanggao")
    public String guanggao(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid="";
        String userId="";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    List<Ad> adList=null;

                    if(adplanid!=null&&!"".equals(adplanid)){
                        log.info("adplanid="+adplanid);
                        adList=adService.findAdByAdPlanId(adplanid);
                    }else{
                        log.info("userId="+userId);
                        adList=adService.findAdByUserId(userId);
                    }
                    model.put("adList", adList);
                    log.info("size="+adList.size());
                    for(int j=0;j<adList.size();j++){
                        Ad ad=(Ad)adList.toArray()[i];
                        log.info("name="+ad.getName()+";id="+ad.getId()+";adid="+ad.getAdId()+";adplanid="+ad.getAdPlanId()+";adplanName="+ad.getAdPlanName());
                    }
                    model.put("adplanid", adplanid);
                    model.put("adList", adList);
                    returnUrl="guanggao";
                    break;
                }
            }
        }
        List<Ad> adList;
        if(adplanid==null||"".equals(adplanid)){
            adList=adService.findAdByUserId(userId);
        }
        else{
            adList=adService.findAdByAdPlanId(adplanid);
        }
        model.put("adList", adList);
        log.info("size="+adList.size());
        for(int i=0;i<adList.size();i++){
            Ad ad=(Ad)adList.toArray()[i];
            log.info("name="+ad.getName()+";id="+ad.getId()+";adplanid="+ad.getAdPlanId()+";adplanName="+ad.getAdPlanName());
        }
        return returnUrl;
    }
    @RequestMapping("/caiwu")
    public String caiwu(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("ad_account_money", "1200");
                    model.put("historical_cost", "10000");
                    model.put("today_cost", "200");
                    model.put("seven_day_cost", "3000");
                    model.put("day", DateUtil.getDay());
                    List<Financial> financialList=financialService.findFinancialByUserId(userId);
                    model.put("financialList", financialList);
                    returnUrl="caiwu";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/per")
    public String per(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userId", userId);
                    model.put("email", user.getEmail());
                    model.put("userName",user.getName());
                    model.put("phone",user.getPhone());
                    model.put("qq",user.getQq());
                    model.put("weixin",user.getWeixin());
                    returnUrl="per";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @RequestMapping("/gg_xinjian")
    public String gg_xinjian(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    List<AdPlan> adPlanList=adPlanService.findAdPlanByUserId(userId);
                    model.put("adPlanList", adPlanList);
                    String adid=request.getParameter("adid");
                    String adplanid=request.getParameter("adplanid");
                    log.info("adid="+adid+";adplanid="+adplanid);
                    Ad ad=adService.getByAdId(adid);
                    if(ad!=null){
                        model.put("adname", ad.getName());
                        model.put("daycost", ad.getDailyLimitMoney());
                        model.put("adplanname", ad.getAdPlanName());
                        model.put("launchtimestart", ad.getLaunchTimeStart().substring(0,10));
                        model.put("launchtimeend", ad.getLaunchTimeEnd().substring(0,10));
                        model.put("delivery_time_type", ad.getDeliveryTimeType());
                        model.put("delivery_time", ad.getDeliveryTime());
                        model.put("display_times", ad.getDisplayTimes());
                        log.info("display_times="+ad.getDisplayTimes());
                        model.put("ad_url", ad.getAdUrl());
                        model.put("callback_url", ad.getCallbackUrl());
                    }

                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    returnUrl="gg_xinjian";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/gg_guige")
    public String gg_guige(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    String adid=request.getParameter("adid");
                    String adplanid=request.getParameter("adplanid");
                    log.info("adid="+adid+";adplanid="+adplanid);
                    Ad ad=adService.getByAdId(adid);
                    if(ad!=null){

                        model.put("adname", ad.getName());
                        model.put("adtype", ad.getAdType());
                        log.info("adtype="+ad.getAdType());
                        List<MaterialImage> materialImageList=materialImageService.findMaterialImageByAdId(adid);
                        for(int k=0;k<materialImageList.size();k++){

                            MaterialImage materialImage=materialImageList.get(k);
                            log.info("img_url="+ materialImage.getImageUrl()+";status="+ materialImage.getStatus());

                        }

                    }

                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    returnUrl="gg_guige";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/gg_dingx")
    public String gg_dingx(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());

                    String adid=request.getParameter("adid");
                    String adplanid=request.getParameter("adplanid");
                    log.info("adid="+adid+";adplanid="+adplanid);

                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    Ad ad=adService.getByAdId(adid);
                    model.put("launch_area", ad.getLaunchArea());
                    model.put("launch_people", ad.getLaunchPeople());
                    model.put("OperateSystem", ad.getOperateSystem());

                  //获取网络类型
                    String NetworkType=ad.getNetworkType();
                    NetworkType="0;2";//测试数据
                    String[] arr1=NetworkType.split(";");
                    String networks="0;1;2";
                    String[] arr3=networks.split(";");
                    List<CheckPojo> NetworkTypeList = new ArrayList();
                    for(int m=0;m<arr3.length;m++){
                        CheckPojo check=new CheckPojo();
                           for(int h=0;h<arr1.length;h++){
                               log.info("m="+m);
                               log.info("h="+h);
                               if(arr3[m].equals(arr1[h])){
                                   check.setCheckValue(arr3[m]);
                                   check.setStatus("1");
                               }
                           }
                        if(m==0){
                            check.setName("WIFI");
                        } if(m==1){
                            check.setName("3G");
                        }if(m==2){
                            check.setName("4G");
                        }
                        NetworkTypeList.add(check);
                    }

                    log.info("networkTypessize="+NetworkTypeList.size());
                    model.put("NetworkTypeList", NetworkTypeList);


                      //获取运营商类型
                    String TelecomOperator=ad.getTelecomOperator();
                    TelecomOperator="1;2";//测试数据
                    String[] arr2=TelecomOperator.split(";");
                    String Telecom="0;1;2";
                    String[] arr4=Telecom.split(";");
                    List<CheckPojo> TelecomList = new ArrayList();
                    for(int m=0;m<arr4.length;m++){
                        CheckPojo check=new CheckPojo();
                        for(int h=0;h<arr2.length;h++){
                            log.info("m="+m);
                            log.info("h="+h);
                            if(arr4[m].equals(arr2[h])){
                                check.setCheckValue(arr4[m]);
                                check.setStatus("1");
                            }
                        }
                        if(m==0){
                            check.setName("移动");
                        } if(m==1){
                            check.setName("联通");
                        }if(m==2){
                            check.setName("电信");
                        }
                        TelecomList.add(check);
                    }

                    log.info("TelecomListsize="+TelecomList.size());
                    model.put("TelecomList", TelecomList);


                    model.put("GenderType", ad.getGenderType());
                    model.put("DeliveryType", ad.getDeliveryType());//投放类型
                   // model.put("DeliveryType", "5");//投放类型
                    Random r = new Random();
                    model.put("userNumbers",  r.nextInt(5000000));//定向人数
                    model.put("pvNumbers",    r.nextInt(100000000));//定向pv
                    model.put("adprice1",    "0.50");//定向pv
                    model.put("adprice2",    "1.00");//定向pv

                    //已经设定的定向投放平台
                    String pdb_platform=ad.getPdbPlatform();
                    pdb_platform="11111122223333;222;1111111";//测试数据
                    String[] arr=pdb_platform.split(";");
//                    List<String> pdbList = Arrays.asList(arr);
//                    log.info("pdbList="+pdbList.size());
//                    model.put("pdbList", pdbList);

                    //可选择的媒体定向平台列表
                    List<Media> mediaList=mediaService.getAll();
                    List<Media> mediaListNew = new ArrayList();
                    for(int j=0;j<mediaList.size();j++) {
                        Media media=(Media) mediaList.toArray()[j];
                        for(int m=0;m<arr.length;m++) {
                            if(media.getMediaId().equals(arr[m])){
                                media.setId(0);
                            }
                        }
                        mediaListNew.add(media);
                    }
                    log.info("mediaListNew="+mediaListNew.size());
                    model.put("mediaList",    mediaListNew);//定向媒体列表

                    returnUrl="gg_dingx";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/gg_tijiao")
    public String gg_tijiao(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;

        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    List<MaterialImage> materialImageList=materialImageService.findMaterialImageByAdId(adid);
                    Ad ad=adService.getByAdId(adid);
                    if(ad!=null){
                        model.put("launchtimestart", ad.getLaunchTimeStart().substring(0,10));
                        model.put("launchtimeend", ad.getLaunchTimeEnd().substring(0,10));
                        if(0==ad.getDeliveryTimeType()){
                            model.put("delivery_time_type", "全时间段");
                        }else if(1==ad.getDeliveryTimeType()){
                            model.put("delivery_time_type", "特定时间段");
                        }else if(2==ad.getDeliveryTimeType()){
                            model.put("delivery_time_type", "高级时间段");
                        }
                        log.info("delivery_time="+ad.getDeliveryTime());
                        model.put("delivery_time", ad.getDeliveryTime());
//                        String[] DeliveryTimes=ad.getDeliveryTime().split(";");
//                        String deliverytime="";
//                        for(int k=0;k<DeliveryTimes.length;k++){
//                            deliverytime=deliverytime+DeliveryTimes[k]+"点,";
//                        }
//                        model.put("delivery_time", deliverytime);
                        model.put("display_times", ad.getDisplayTimes());
                        if(ad.getPdbPlatform()==null||"0".equals(ad.getPdbPlatform())){
                            model.put("pdb_platform", "不限平台");
                        }else {
                            model.put("pdb_platform", ad.getPdbPlatform());
                        }
                        model.put("launch_area", ad.getLaunchArea());
                        model.put("launch_people", ad.getLaunchPeople());
                        if(ad.getGenderType()==0){
                            model.put("gender_type","不限" );
                        }else if(ad.getGenderType()==1){
                            model.put("gender_type","女" );
                        }else if(ad.getGenderType()==2){
                            model.put("gender_type","男" );
                        }
                        if(ad.getDeliveryType()==0){
                            model.put("delivery_type","CPC" );
                        }else if(ad.getDeliveryType()==1){
                            model.put("delivery_type","CPM" );
                        }else if(ad.getDeliveryType()==2){
                            model.put("delivery_type","CPS" );
                        }else if(ad.getDeliveryType()==3){
                            model.put("delivery_type","CPD" );
                        }else if(ad.getDeliveryType()==4){
                            model.put("delivery_type","CPA" );
                        }else if(ad.getDeliveryType()==5){
                            model.put("delivery_type","CPT" );
                        }

                        model.put("offer_price", ad.getOfferPrice());
                        log.info("offer_price="+ad.getOfferPrice());
                    }
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    model.put("materialImageList", materialImageList);
                    log.info("size="+materialImageList.size());
                    for(int j=0;j<materialImageList.size();j++){
                        MaterialImage materialImage=(MaterialImage)materialImageList.toArray()[j];
                        log.info("name="+materialImage.getName()+";id="+materialImage.getId()+";materialid="+materialImage.getMaterialId()+";status="+materialImage.getStatus());
                    }
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="gg_tijiao";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/guangao_con")
    public String guangao_con(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;

        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    List<MaterialImage> materialImageList=materialImageService.findMaterialImageByAdId(adid);
                    Ad ad=adService.getByAdId(adid);
                    if(ad!=null){
                        model.put("adname", ad.getName());
                        model.put("daycost", ad.getDailyLimitMoney());
                        model.put("adplanname", ad.getAdPlanName());
                        model.put("launchtimestart", ad.getLaunchTimeStart());
                        model.put("launchtimeend", ad.getLaunchTimeEnd());
                        if(0==ad.getDeliveryTimeType()){
                            model.put("delivery_time_type", "全时间段");
                        }else if(1==ad.getDeliveryTimeType()){
                            model.put("delivery_time_type", "特定时间段");
                        }else if(2==ad.getDeliveryTimeType()){
                            model.put("delivery_time_type", "高级时间段");
                        }
                           log.info("delivery_time="+ad.getDeliveryTime());
                           model.put("delivery_time", ad.getDeliveryTime());
//                        String[] DeliveryTimes=ad.getDeliveryTime().split(";");
//                        String deliverytime="";
//                        for(int k=0;k<DeliveryTimes.length;k++){
//                            deliverytime=deliverytime+DeliveryTimes[k]+"点,";
//                        }
//                        model.put("delivery_time", deliverytime);
                        model.put("display_times", ad.getDisplayTimes());
                        model.put("pdb_platform", ad.getPdbPlatform());
                        model.put("launch_area", ad.getLaunchArea());
                        model.put("launch_people", ad.getLaunchPeople());
                        if(ad.getGenderType()==0){
                            model.put("gender_type","不限" );
                        }else if(ad.getGenderType()==1){
                            model.put("gender_type","女" );
                        }else if(ad.getGenderType()==2){
                            model.put("gender_type","男" );
                        }
                        model.put("operate_system", ad.getOperateSystem());
                        model.put("network_type", ad.getNetworkType());
                        model.put("telecom_operator", ad.getTelecomOperator());
                        if(ad.getDeliveryType()==0){
                            model.put("delivery_type","CPC" );
                        }else if(ad.getDeliveryType()==1){
                            model.put("delivery_type","CPM" );
                        }else if(ad.getDeliveryType()==2){
                            model.put("delivery_type","CPS" );
                        }else if(ad.getDeliveryType()==3){
                            model.put("delivery_type","CPD" );
                        }else if(ad.getDeliveryType()==4){
                            model.put("delivery_type","CPA" );
                        }else if(ad.getDeliveryType()==5){
                            model.put("delivery_type","CPT" );
                        }

                        model.put("offer_price", ad.getOfferPrice());
                        log.info("offer_price="+ad.getOfferPrice());
                    }
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    model.put("materialImageList", materialImageList);
                    log.info("size="+materialImageList.size());
                    for(int j=0;j<materialImageList.size();j++){
                        MaterialImage materialImage=(MaterialImage)materialImageList.toArray()[j];
                        log.info("name="+materialImage.getName()+";id="+materialImage.getId()+";materialid="+materialImage.getMaterialId()+";status="+materialImage.getStatus());
                    }
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="guangao_con";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @RequestMapping("/ggcon_wenzi")
    public String ggcon_wenzi(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;

        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="ggcon_wenzi";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @RequestMapping("/ggcon_kpxxl")
    public String ggcon_kpxxl(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;

        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="ggcon_kpxxl";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/ggcon_ptxxl")
    public String ggcon_ptxxl(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;

        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="ggcon_ptxxl";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @RequestMapping("/ggcon_threeh")
    public String ggcon_threeh(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="ggcon_threeh";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/ggcon_twoh")
    public String ggcon_twoh(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="ggcon_twoh";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @RequestMapping("/ggcon_yh")
    public String ggcon_yh(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="ggcon_yh";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @RequestMapping("/gg_tj_threeh")
    public String gg_tj_threeh(Map<String, Object> model,HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String returnUrl="index";
        String adplanid;
        String adid;
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("userId", userId);
                    model.put("day", DateUtil.getDay());
                    adplanid=request.getParameter("adplanid");
                    adid=request.getParameter("adid");
                    model.put("adplanid", adplanid);
                    model.put("adid", adid);
                    log.info("adplanid="+adplanid+";adid="+adid);
                    returnUrl="gg_tj_threeh";
                    break;
                }
            }
        }
        return returnUrl;
    }

    @ResponseBody
    @RequestMapping("/getLastDay")
    public String getLastDay(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {
        String past = request.getParameter("past");
        if(past==null||"".equals(past)){
            past="0";
        }
        log.info(">>>>>>>>"+past+"  "+past);
        String pastDay=DateUtil.getPastDate(Integer.parseInt(past));
        String day=DateUtil.getDay();
        if(!past.equals("0")){
            day=DateUtil.getLastDay();
        }
        log.info(pastDay+":"+day);

        return "{\"pastDay\":"+"\""+pastDay+"\",\"day\":\""+day+"\"}";
    }

    @ResponseBody
    @RequestMapping("/searchForGaiKuang")
    public String searchForGuaiKuang(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        log.info(">>>>>>>>startDate="+startDate+"; endDate"+endDate);

        return "";
        //return "{\"pastDay\":"+"\""+pastDay+"\",\"day\":\""+day+"\"}";
    }
}