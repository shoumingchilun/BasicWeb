package com.chilun.qqzone.controller;

import com.chilun.qqzone.pojo.Topic;
import com.chilun.qqzone.pojo.UserBasic;
import com.chilun.qqzone.service.TopicService;
import com.chilun.qqzone.service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:59
 */
public class UserController {
    private UserBasicService userBasicService;
    private TopicService topicService;
    //1.登录验证
    public String login(String loginId, String pwd, HttpSession session) {
        UserBasic userBasic = userBasicService.login(loginId, pwd);
        if (userBasic != null) {
            //获取好友信息
            List<UserBasic> friendList = userBasicService.getFriendList(userBasic);
            //获取日志信息
            List<Topic> topicList = topicService.getTopicList(userBasic);

            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);

            session.setAttribute("userBasic",userBasic);
            return "index";
        }else{
            return "login";
        }
    }
}
