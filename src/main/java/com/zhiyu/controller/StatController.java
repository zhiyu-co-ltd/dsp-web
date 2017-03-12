package com.zhiyu.controller;

import com.zhiyu.model.StatInfo;
import com.zhiyu.service.StatService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class StatController {
	Logger log = Logger.getLogger(StatController.class);

	@Autowired
	private StatService statService;


    @ResponseBody
    @RequestMapping("/stat/adInfo")
    public StatInfo getStatInfo(@RequestParam String userId ,@RequestParam String startDay ,@RequestParam String endDay ) {

        log.info(">>>>>>>>"+userId+"   "+startDay+"    "+endDay);
        //String userEmail="iceriver2000@aliyun.com" ;
        //int startDay=20170308;
        //int endDay = 20170312;
        StatInfo statInfo = statService.getUserAdInfo(userId,Integer.parseInt(startDay),Integer.parseInt(endDay));

        return statInfo;
    }
}