package com.zhiyu.controller;

import java.util.Map;

import com.zhiyu.model.User;
import com.zhiyu.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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
	public String ad(Map<String, Object> model) {
		return "ad";
	}
	@RequestMapping("/feed")
	public String feed(Map<String, Object> model) {
		return "feed";
	}
	@RequestMapping("/about")
	public String about(Map<String, Object> model) {return "about";
	}
	@RequestMapping("/gaikuang")
	public String gaikuang(Map<String, Object> model) {return "gaikuang";
	}
}