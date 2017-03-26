package com.zhiyu.controller;

import java.util.List;
import java.util.Map;

import com.zhiyu.model.*;
import com.zhiyu.service.*;

import com.zhiyu.util.DateUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WelcomeController {
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
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
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
                        model.put("delivery_time_type", ad.getDeliveryTimeType());
                        model.put("delivery_time", ad.getDeliveryTime());
                        model.put("display_times", ad.getDisplayTimes());
                        model.put("pdb_platform", ad.getPdbPlatform());
                        model.put("launch_area", ad.getLaunchArea());
                        model.put("launch_people", ad.getLaunchPeople());
                        model.put("gender_type", ad.getGenderType());
                        model.put("operate_system", ad.getOperateSystem());
                        model.put("network_type", ad.getNetworkType());
                        model.put("telecom_operator", ad.getTelecomOperator());
                        model.put("ad_type", ad.getAdType());
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