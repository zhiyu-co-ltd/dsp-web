package com.mkyong;

import org.apache.catalina.connector.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {

	@RequestMapping("/login")
	public String login(Map<String, Object> model, HttpRequest httpRequest) {
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