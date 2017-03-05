package com.zhiyu.controller;

import com.zhiyu.model.User;
import com.zhiyu.service.UserService;
import com.zhiyu.service.impl.UserServiceImpl;
import org.apache.catalina.connector.Request;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class UserController {
	Logger log = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(Map<String, Object> model,HttpServletRequest request) {
        String email = request.getParameter("email") ;
		String password = request.getParameter("password");
		User user =  userService.findUserByEmail(email);
		log.info(">>>>>>>>"+user.getEmail()+"  "+user.getName());
		model.put("loginStatus","true");
//		String email=httpRequest.
//		String password=httpRequest.getParameter("password");
//		System.out.println("email="+email);
//		System.out.println("password="+password);
		return "index";
	}
	@RequestMapping("/register")
	public String register(Map<String, Object> model) {

		return "ad";
	}
	@RequestMapping("/checkEmail")
	public String checkEmail(Map<String, Object> model) {
		return "feed";
	}

	@RequestMapping("/findPassword/{email}")
	public String findPassword(Map<String, Object> model) {
		model.put("hello","from TemplateController.helloFtl");
		return "index";}
}