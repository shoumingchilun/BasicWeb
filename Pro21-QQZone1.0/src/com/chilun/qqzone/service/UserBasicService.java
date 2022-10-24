package com.chilun.qqzone.service;

import com.chilun.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:39
 */
public interface UserBasicService {
    UserBasic login(String loginId, String pwd);
    List<UserBasic> getFriendList(UserBasic userBasic);
}
