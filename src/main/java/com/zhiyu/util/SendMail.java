package com.zhiyu.util;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import java.util.*;
import javax.activation.*;

/**
 * Created by zhaojianfan on 17/3/6.
 */
public class SendMail {

    private String host = ""; // smtp服务器
    private String from = ""; // 发件人地址
    private String to = ""; // 收件人地址
    private String user = ""; // 用户名
    private String pwd = ""; // 密码
    private String subject = ""; // 邮件标题

    public void setAddress(String from, String to, String subject) {
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    public void send(String host, String user, String pwd,String sendContent) {
        this.host = host;
        this.user = user;
        this.pwd = pwd;

        Properties props = new Properties();

        // 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）
        props.put("mail.smtp.host", host);
        // 需要经过授权，也就是有户名和密码的校验，这样才能通过验证（一定要有这一条）
        props.put("mail.smtp.auth", "true");

        // 用刚刚设置好的props对象构建一个session
        Session session = Session.getDefaultInstance(props);

        // 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使
        // 用（你可以在控制台（console)上看到发送邮件的过程）
        session.setDebug(true);

        // 用session为参数定义消息对象
        MimeMessage message = new MimeMessage(session);
        try {
            // 加载发件人地址
            message.setFrom(new InternetAddress(from));
            // 加载收件人地址
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // 加载标题
            message.setSubject(subject);

            // 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
            Multipart multipart = new MimeMultipart();

            // 设置邮件的文本内容
            BodyPart contentPart = new MimeBodyPart();
            contentPart.setText(sendContent);
            multipart.addBodyPart(contentPart);
            // 将multipart对象放到message中
            message.setContent(multipart);
            // 保存邮件
            message.saveChanges();
            // 发送邮件
            Transport transport = session.getTransport("smtp");
            // 连接服务器的邮箱
            transport.connect(host, user, pwd);
            // 把邮件发送出去
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SendMail cn = new SendMail();
        // 设置发件人地址、收件人地址和邮件标题
        cn.setAddress("zjf198100@163.com", "jianfanz@oupeng.com", "知渔广告平台注册密码");

        /**
         * 设置smtp服务器以及邮箱的帐号和密码
         * 用QQ 邮箱作为发生者不好使 （原因不明）
         * 163 邮箱可以，但是必须开启  POP3/SMTP服务 和 IMAP/SMTP服务
         * 因为程序属于第三方登录，所以登录密码必须使用163的授权码
         */

       // 注意： [授权码和你平时登录的密码是不一样的]
        cn.send("smtp.163.com", "zjf198100@163.com", "982001","亲爱的用户您好!感谢您使用知渔移动广告平台!您的注册密码是:11111111");

    }

}
