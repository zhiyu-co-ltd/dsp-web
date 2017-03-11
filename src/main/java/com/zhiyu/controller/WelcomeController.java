package com.zhiyu.controller;

import java.util.Map;

import com.zhiyu.model.User;
import com.zhiyu.service.UserService;

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
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    model.put("day", DateUtil.getDay());
                    returnUrl="tuiguang";
                    break;
                }
            }
        }
        return returnUrl;
    }
    @RequestMapping("/guanggao")
    public String guanggao(Map<String, Object> model,HttpServletRequest request) {
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
                    model.put("day", DateUtil.getDay());
                    returnUrl="guanggao";
                    break;
                }
            }
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
                    model.put("userName", user.getName());
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
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    User user = userService.findUserByUserId(userId);
                    model.put("loginStatus", "true");
                    model.put("userName", user.getName());
                    returnUrl="guangao_con";
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