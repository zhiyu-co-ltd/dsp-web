package com.zhiyu.controller;

import com.zhiyu.model.Ad;
import com.zhiyu.model.MaterialImage;
import com.zhiyu.model.MaterialText;
import com.zhiyu.model.MaterialPtxxl;
import com.zhiyu.model.User;
import com.zhiyu.service.AdService;
import com.zhiyu.service.MaterialImageService;
import com.zhiyu.service.MaterialTextService;
import com.zhiyu.service.MaterialPtxxlService;
import com.zhiyu.service.UserService;
import com.zhiyu.util.DateUtil;
import com.zhiyu.util.FileUtil;
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

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * Created by zhaojianfan on 17/3/12.
 */
@Controller
public class MaterialController {

    Logger log = Logger.getLogger(MaterialController.class);

    @Autowired
    private AdService adService;
    @Autowired
    private UserService userService;

    @Autowired
    private MaterialImageService materialImageService;

    @Autowired
    private MaterialTextService materialTextService;

    @Autowired
    private MaterialPtxxlService materialPtxxlService;


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
    @RequestMapping("/findMaterialByName")
    public String findMaterialByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "guangao_con";
    }

    @RequestMapping("/findMaterialWenZiByName")
    public String findMaterialWenZiByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "ggcon_wenzi";
    }

    @RequestMapping("/findMaterialKpByName")
    public String findMaterialKpByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "ggcon_kpxxl";
    }

    @RequestMapping("/findMaterialPtByName")
    public String findMaterialPtByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "ggcon_ptxxl";
    }
    @RequestMapping("/findMaterialThreehByName")
    public String findMaterialThreehByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "ggcon_threeh";
    }
    @RequestMapping("/findMaterialTwohByName")
    public String findMaterialTwohByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "ggcon_twoh";
    }

    @RequestMapping("/findMaterialYhByName")
    public String findMaterialYhByName(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {

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
        return "ggcon_yh";
    }

    @ResponseBody
    @RequestMapping("/updateMaterialStatus")
    public  Object updateMaterialStatus(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) {

        String materialid  = request.getParameter("materialid") ;
        String materialtype = request.getParameter("materialtype") ;
        String materialstatus = request.getParameter("materialstatus") ;
        Object object =new Object();
        log.info("materialid="+materialid+";materialstatus="+materialstatus+";materialtype="+materialtype);

        if(materialstatus.equals("0")){
            materialstatus="1";
        }
        else if(materialstatus.equals("2")){
            materialstatus="5";
        } else if(materialstatus.equals("3")){
            materialstatus="1";
        } else if(materialstatus.equals("4")){
            materialstatus="5";
        } else if(materialstatus.equals("5")){
            materialstatus="6";
        } else if(materialstatus.equals("6")){
            materialstatus="4";
        } else if(materialstatus.equals("7")){
            materialstatus="8";
        }

        if("image".equals(materialtype)){
            materialImageService.updateStatus(materialstatus,Integer.parseInt(materialid));
            object=materialImageService.getById(Integer.parseInt(materialid));
        }


        log.info("object="+object);

        return object;
    }
 //上传物料图片
    @ResponseBody
    @RequestMapping("/uploadMaterialTupian")
    public String uploadMaterialTupian(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {
        log.info("------uploadMaterialTupian------");
        String adid = request.getParameter("adid") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");
        log.info("------adid="+adid+"--;userid="+userid+";adplanid="+adplanid);
        String path="/Users/zhaojianfan/project/zhiyu/dsp2017/dsp-web/src/main/resources/static/webImage/";

//        String[] tupianCheck1s = request.getParameterValues("tupianCheck1");
//        if(tupianCheck1s!=null) {
//            log.info("------tupianCheck1s=" + tupianCheck1s.length);
//            for (int i = 0; i < tupianCheck1s.length; i++) {
//                String tupianCheck = tupianCheck1s[i];
//                log.info("------tupianCheck1=" + tupianCheck);
//            }
//        }

//        String[] tupianCheck2s = request.getParameterValues("tupianCheck2");
//        if(tupianCheck2s!=null) {
//            log.info("------tupianCheck2s=" + tupianCheck2s.length);
//            for (int i = 0; i < tupianCheck2s.length; i++) {
//                String tupianCheck = tupianCheck2s[i];
//                log.info("------tupianCheck2=" + tupianCheck);
//            }
//        }
        String[] tupianName1s = request.getParameterValues("tupianName1");
        log.info("------tupianName1s="+tupianName1s.length);
        for(int i=0;i<tupianName1s.length;i++){
            String tupianName=tupianName1s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("tupianCheck1_"+(i+1));
                log.info("------tupianCheck=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("Filestupian1_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("600*200");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(0);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] tupianName2s = request.getParameterValues("tupianName2");
        log.info("------tupianName2s="+tupianName2s.length);
        for(int i=0;i<tupianName2s.length;i++){
            String tupianName=tupianName2s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("tupianCheck2_"+(i+1));
                log.info("------tupianCheck=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("Filestupian2_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            log.info("------tupianName="+tupianName);
                            log.info("------imageUrl="+DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg");
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("600*200");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(0);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);

                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
//        String path="/Users/zhaojianfan/project/zhiyu/dsp2017/dsp-web/src/main/resources/static/webImage/";
//
//        List<MultipartFile> filestupian1 =((MultipartHttpServletRequest)request).getFiles("Filestupian1");
//        log.info("files1="+filestupian1.size());
//        MultipartFile file = null;
//
//        for (int i =0; i< filestupian1.size(); ++i) {
//            log.info("i="+i);
//            file = filestupian1.get(i);
//            if (!file.isEmpty()) {
//
//                try {
//
//                    byte[] bytes = file.getBytes();
//                    FileUtil fileUtil = new FileUtil();
//                    fileUtil.uploadFile(bytes,path,DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg");
//
//                }catch(Exception e){
//                    log.info("uploadMaterial="+e.toString());
//                }
//            }else {
//                log.info("You failed to upload " + i + " because the file was empty.");
//            }
//        }
//        List<MultipartFile> filestupian2 =((MultipartHttpServletRequest)request).getFiles("Filestupian2");
//        log.info("files2="+filestupian2.size());
//        MultipartFile file2 = null;
//
//        for (int i =0; i< filestupian2.size(); ++i) {
//            log.info("i="+i);
//            file2= filestupian2.get(i);
//
//            if (!file2.isEmpty()) {
//
//                try {
//
//                    byte[] bytes = file2.getBytes();
//                    FileUtil fileUtil = new FileUtil();
//                    fileUtil.uploadFile(bytes,path,DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg");
//
//
//                }catch(Exception e){
//                    log.info("uploadMaterial="+e.toString());
//                }
//            }else {
//                log.info("You failed to upload " + i + " because the file was empty.");
//            }
//        }
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "gg_guige?adid="+adid+"&adplanid="+adplanid;
    }
    //上传图片物料
    @ResponseBody
    @RequestMapping("/uploadMaterialChaping")
    public String uploadMaterialChaping(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {
        log.info("------uploadMaterialChaping------");
        String adid = request.getParameter("adid") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");
        log.info("------adid="+adid+"--;userid="+userid+";adplanid="+adplanid);
        String path="/Users/zhaojianfan/project/zhiyu/dsp2017/dsp-web/src/main/resources/static/webImage/";
        String[] chapingName1s = request.getParameterValues("chapingName1");
        log.info("------chapingName1s="+chapingName1s.length);
        for(int i=0;i<chapingName1s.length;i++){
            String tupianName=chapingName1s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("chapingCheck1_"+(i+1));
                log.info("------chapingCheck1=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesChaping1_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("600*500");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(1);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] chapingName2s = request.getParameterValues("chapingName2");
        log.info("------chapingName2s="+chapingName2s.length);
        for(int i=0;i<chapingName2s.length;i++){
            String tupianName=chapingName2s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("chapingCheck2_"+(i+1));
                log.info("------chapingCheck2=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesChaping2_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("600*800");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(1);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] chapingName3s = request.getParameterValues("chapingName3");
        log.info("------chapingName3s="+chapingName3s.length);
        for(int i=0;i<chapingName3s.length;i++){
            String tupianName=chapingName3s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("chapingCheck3_"+(i+1));
                log.info("------chapingCheck3=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesChaping3_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("640*960");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(1);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] chapingName4s = request.getParameterValues("chapingName4");
        log.info("------chapingName4s="+chapingName4s.length);
        for(int i=0;i<chapingName4s.length;i++){
            String tupianName=chapingName4s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("chapingCheck4_"+(i+1));
                log.info("------chapingCheck4=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesChaping4_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("480*800");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(1);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] chapingName5s = request.getParameterValues("chapingName5");
        log.info("------chapingName5s="+chapingName5s.length);
        for(int i=0;i<chapingName5s.length;i++){
            String tupianName=chapingName5s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("chapingCheck5_"+(i+1));
                log.info("------chapingCheck5=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesChaping5_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("720*1280");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(1);//banner
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }

        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "gg_guige?adid="+adid+"&adplanid="+adplanid;
    }

    //上传图片物料
    @ResponseBody
    @RequestMapping("/uploadMaterialKaiping")
    public String uploadMaterialKaiping(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {
        log.info("------uploadMaterialChaping------");
        String adid = request.getParameter("adid") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");
        log.info("------adid="+adid+"--;userid="+userid+";adplanid="+adplanid);
        String path="/Users/zhaojianfan/project/zhiyu/dsp2017/dsp-web/src/main/resources/static/webImage/";
        String[] kaipingName1s = request.getParameterValues("kaipingName1");
        log.info("------kaipingName1s="+kaipingName1s.length);
        for(int i=0;i<kaipingName1s.length;i++){
            String tupianName=kaipingName1s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("kaipingCheck1_"+(i+1));
                log.info("------kaipingCheck1_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesKaiping1_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("600*800");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(2);//开屏
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] kaipingName2s = request.getParameterValues("kaipingName2");
        log.info("------kaipingName2s="+kaipingName2s.length);
        for(int i=0;i<kaipingName2s.length;i++){
            String tupianName=kaipingName2s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("kaipingCheck2_"+(i+1));
                log.info("------kaipingCheck2=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesKaiping2_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("480*800");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(2);//开屏
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] kaipingName3s = request.getParameterValues("kaipingName3");
        log.info("------kaipingName3s="+kaipingName3s.length);
        for(int i=0;i<kaipingName3s.length;i++){
            String tupianName=kaipingName3s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("kaipingCheck3_"+(i+1));
                log.info("------kaipingCheck3_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesKaiping3_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("640*960");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(2);//开屏
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] kaipingName4s = request.getParameterValues("kaipingName4");
        log.info("------chapingName4s="+kaipingName4s.length);
        for(int i=0;i<kaipingName4s.length;i++){
            String tupianName=kaipingName4s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("kaipingCheck4_"+(i+1));
                log.info("------kaipingCheck4_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    MultipartFile file= ((MultipartHttpServletRequest)request).getFile("FilesKaiping4_"+(i+1));
                    log.info("----file="+file.getSize());
                    if (file!=null) {
                        try {
                            String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                            byte[] bytes = file.getBytes();
                            FileUtil fileUtil = new FileUtil();
                            fileUtil.uploadFile(bytes,path,imageUrl);
                            MaterialImage materialImage=new MaterialImage();
                            materialImage.setName(tupianName);
                            materialImage.setSize("720*1280");
                            materialImage.setAdId(adid);
                            materialImage.setMaterialId(MyUUID.getUUID());
                            materialImage.setStatus("0");//待审核
                            materialImage.setType(2);//开屏
                            materialImage.setImageUrl(imageUrl);
                            materialImageService.save(materialImage);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "gg_guige?adid="+adid+"&adplanid="+adplanid;
    }
    //上传图片物料
    @ResponseBody
    @RequestMapping("/uploadMaterialWenzi")
    public String uploadMaterialWenzi(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {
        log.info("------uploadMaterialWenzi------");
        String adid = request.getParameter("adid") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");
        log.info("------adid="+adid+"--;userid="+userid+";adplanid="+adplanid);
        String[] wenziName1s = request.getParameterValues("wenziName1");
        log.info("------wenziName1s="+wenziName1s.length);
        for(int i=0;i<wenziName1s.length;i++){
            String tupianName=wenziName1s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("wenziCheck1_"+(i+1));
                log.info("------wenziCheck1_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    String wenziContent=request.getParameter("FilesWenzi1_"+(i+1));
                    log.info("----wenziContent="+wenziContent);
                    if (wenziContent!=null) {
                        try {
                            MaterialText materialText=new MaterialText();
                            materialText.setName(tupianName);
                            materialText.setContent(wenziContent);
                            materialText.setSize("8*1");
                            materialText.setAdId(adid);
                            materialText.setMaterialId(MyUUID.getUUID());
                            materialText.setStatus("0");//待审核
                            materialTextService.save(materialText);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] wenziName2s = request.getParameterValues("wenziName2");
        log.info("------wenziName2s="+wenziName2s.length);
        for(int i=0;i<wenziName2s.length;i++){
            String tupianName=wenziName2s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("wenziCheck2_"+(i+1));
                log.info("------wenziCheck2_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    String wenziContent=request.getParameter("FilesWenzi2_"+(i+1));
                    log.info("----wenziContent="+wenziContent);
                    if (wenziContent!=null) {
                        try {
                            MaterialText materialText=new MaterialText();
                            materialText.setName(tupianName);
                            materialText.setContent(wenziContent);
                            materialText.setSize("16*1");
                            materialText.setAdId(adid);
                            materialText.setMaterialId(MyUUID.getUUID());
                            materialText.setStatus("0");//待审核
                            materialTextService.save(materialText);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] wenziName3s = request.getParameterValues("wenziName3");
        log.info("------wenziName3s="+wenziName3s.length);
        for(int i=0;i<wenziName3s.length;i++){
            String tupianName=wenziName3s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("wenziCheck3_"+(i+1));
                log.info("------wenziCheck3_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    String wenziContent=request.getParameter("FilesWenzi3_"+(i+1));
                    log.info("----wenziContent="+wenziContent);
                    if (wenziContent!=null) {
                        try {
                            MaterialText materialText=new MaterialText();
                            materialText.setName(tupianName);
                            materialText.setContent(wenziContent);
                            materialText.setSize("24*1");
                            materialText.setAdId(adid);
                            materialText.setMaterialId(MyUUID.getUUID());
                            materialText.setStatus("0");//待审核
                            materialTextService.save(materialText);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }
        String[] wenziName4s = request.getParameterValues("wenziName4");
        log.info("------wenziName4s="+wenziName4s.length);
        for(int i=0;i<wenziName4s.length;i++){
            String tupianName=wenziName4s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("wenziCheck4_"+(i+1));
                log.info("------wenziCheck4_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    String wenziContent=request.getParameter("FilesWenzi4_"+(i+1));
                    log.info("----wenziContent="+wenziContent);
                    if (wenziContent!=null) {
                        try {
                            MaterialText materialText=new MaterialText();
                            materialText.setName(tupianName);
                            materialText.setContent(wenziContent);
                            materialText.setSize("40*1");
                            materialText.setAdId(adid);
                            materialText.setMaterialId(MyUUID.getUUID());
                            materialText.setStatus("0");//待审核
                            materialTextService.save(materialText);
                        }catch(Exception e){
                            log.info("uploadMaterial="+e.toString());
                        }
                    }else {
                        log.info("You failed to upload " + i + " because the file was empty.");
                    }
                }
            }
        }

        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "gg_guige?adid="+adid+"&adplanid="+adplanid;
    }

    //上传图片物料
    @ResponseBody
    @RequestMapping("/uploadMaterialPtxxl")
    public String uploadMaterialPtxxl(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) {
        log.info("------uploadMaterialPtxxl------");
        String adid = request.getParameter("adid") ;
        String userid = request.getParameter("userid");
        String adplanid = request.getParameter("adplanid");
        log.info("------adid="+adid+"--;userid="+userid+";adplanid="+adplanid);
        String path="/Users/zhaojianfan/project/zhiyu/dsp2017/dsp-web/src/main/resources/static/webImage/";
        String[] ptxxlName1s = request.getParameterValues("ptxxlName1");
        log.info("------ptxxlName1s="+ptxxlName1s.length);
        for(int i=0;i<ptxxlName1s.length;i++){
            String tupianName=ptxxlName1s[i];
            if(tupianName!=null&&!"".equals(tupianName)){
                String tupianCheck=request.getParameter("ptxxlCheck1_"+(i+1));
                log.info("------ptxxlCheck1_=" + tupianCheck);
                if("on".equals(tupianCheck)){
                    log.info("----saving----");
                    String ptxxlNameAd=request.getParameter("ptxxlNameAd1_"+(i+1));
                    log.info("----ptxxlNameAd="+ptxxlNameAd);
                    String FilesPtxxl=request.getParameter("FilesPtxxl1_"+(i+1));
                    log.info("----FilesPtxxl="+FilesPtxxl);
                    if (ptxxlNameAd!=null) {
                        MultipartFile file = ((MultipartHttpServletRequest) request).getFile("Filesptxxl1_" + (i + 1));
                        log.info("----file=" + file.getSize());
                        if (file != null) {
                            try {

                                String imageUrl=DateUtil.getDay()+"_"+DateUtil.getTime()+".jpg";
                                byte[] bytes = file.getBytes();
                                FileUtil fileUtil = new FileUtil();
                                fileUtil.uploadFile(bytes,path,imageUrl);

                                MaterialPtxxl materialPtxll = new MaterialPtxxl();
                                materialPtxll.setName(tupianName);
                                materialPtxll.setContentAd(ptxxlNameAd);
                                materialPtxll.setFileAd(FilesPtxxl);
                                materialPtxll.setImage_url(imageUrl);
                                materialPtxll.setSize("240*240");
                                materialPtxll.setAdId(adid);
                                materialPtxll.setMaterialId(MyUUID.getUUID());
                                materialPtxll.setStatus("0");//待审核
                                materialPtxxlService.save(materialPtxll);
                            } catch (Exception e) {
                                log.info("uploadMaterial=" + e.toString());
                            }
                        } else {
                            log.info("You failed to upload " + i + " because the file was empty.");
                        }
                    }
                }
            }
        }

        Cookie Usercookie = new Cookie("userId",userid);
        Usercookie.setMaxAge(60*60*24*7);//保留7天
        response.addCookie(Usercookie);
        return "gg_guige?adid="+adid+"&adplanid="+adplanid;
    }
}
