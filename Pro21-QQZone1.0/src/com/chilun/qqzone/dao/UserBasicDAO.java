package com.chilun.qqzone.dao;

import com.chilun.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-22:54
 */
public interface UserBasicDAO {
    //1.根据账号密码获得用户信息
    public UserBasic getUserBasic(String loginId,String pwd);
    //2.获得指定用户好友信息
    public List<UserBasic> getUserBasicList(UserBasic userBasic);
    //3.根据id查询UserBasic信息
    UserBasic getUserBasicById(Integer id);
}
