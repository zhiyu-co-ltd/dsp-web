package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {



	@RequestMapping("/index")
	public String welcome(Map<String, Object> model) {
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
}