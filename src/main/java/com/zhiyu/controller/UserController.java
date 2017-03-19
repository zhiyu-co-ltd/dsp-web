package com.zhiyu.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zhiyu.model.User;
import com.zhiyu.service.UserService;
import com.zhiyu.service.impl.UserServiceImpl;
import com.zhiyu.util.MyUUID;
import com.zhiyu.util.SendMail;
import org.apache.catalina.connector.Request;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import java.util.Map;

@Controller
public class UserController {
	Logger log = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {
        String email = request.getParameter("email") ;
		String password = request.getParameter("password");
		User user =  userService.findUserByEmailAndPassword(email,password);

		if(user == null ){


		}else{
			log.info(">>>>>>>>"+user.getEmail()+"  "+user.getName()+user.getUserId());
			model.put("loginStatus","true");
			model.put("userName",user.getName());
            Cookie Usercookie = new Cookie("userId",user.getUserId());
            Usercookie.setMaxAge(60*60*24*7);//保留7天
            response.addCookie(Usercookie);
        }
		return "index";
	}
	@RequestMapping("/register")
	public String register(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {
        String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		User user = new User();
		user.setName(userName);
		user.setPassword(password);
		user.setEmail(email);
		user.setUser_Id(MyUUID.getUUID());
		userService.save(user);
		log.info(">>>>>>>>"+email+"  "+userName);
		model.put("loginStatus","true");
		model.put("userName",userName);
        Cookie Usercookie = new Cookie("userId",user.getUserId());
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
		return "index";
	}
    @RequestMapping("/updateUser")
    public String update(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {

        String userid = request.getParameter("userid");
        String qq = request.getParameter("qq");
        String phone = request.getParameter("phone");
        String weixin = request.getParameter("weixin");
        log.info(">>>>>>>>userid="+userid+";qq="+qq+";phone="+phone+";weixin="+weixin);
        User user= userService.findUserByUserId(userid);
        log.info(">>>>>>>>user="+user);
        user.setPhone(phone);
        user.setQq(qq);
        user.setWeixin(weixin);
        userService.save(user);
        model.put("loginStatus","true");
        model.put("userName",user.getName());
        model.put("userId",userid);
        model.put("phone",user.getPhone());
        model.put("qq",user.getQq());
        model.put("weixin",user.getWeixin());
        Cookie Usercookie = new Cookie("userId",user.getUserId());
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "per";
    }
    @ResponseBody
    @RequestMapping("/checkEmail")
	public User checkEmail(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {
        String email = request.getParameter("email");
        log.info(">>>>>>>>"+email+"  "+email);
        User user =  userService.findUserByEmail(email);
        if(user!=null) {
            log.info(">>>>>>>>" + user + "用户名:" + user.getName() + "密码" + user.getPassword());
        }else{
            user=new User();
        }
        log.info("user=" + user);
        return user;
	}

	@RequestMapping("/findPassword")
	public String findPassword(Map<String, Object> model,HttpServletRequest request) {
		String email = request.getParameter("email");
        log.info(">>>>>>>>"+email+"  "+email);
		User user =  userService.findUserByEmail(email);
        if(user!=null) {
            log.info(">>>>>>>>" + user + "用户名:" + user.getName() + "密码" + user.getPassword());
            SendMail sendMail = new SendMail();
            sendMail.setAddress("zjf198100@163.com", email, "知渔广告平台注册密码");
            sendMail.send("smtp.163.com", "zjf198100@163.com", "982001", "亲爱的用户:" + user.getName() + "您好!感谢您使用知渔移动广告平台!您的注册密码是:" + user.getPassword());
        }
		return "index";
	}

    @RequestMapping("/signout")
    public String signout(Map<String, Object> model,HttpServletRequest request,HttpServletResponse response) {
        Cookie[] cookie = request.getCookies();
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                Cookie cook = cookie[i];
                if (cook.getName().equalsIgnoreCase("userId")) { //获取键
                    String userId = cook.getValue().toString();
                    cook.setMaxAge(0);//清除cookie
                    cook.setPath("/");
                    response.addCookie(cook);
                    break;
                }
            }
        }
        return "index";
    }
}