package com.chilun.qqzone.service;

import com.chilun.qqzone.pojo.Topic;
import com.chilun.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:52
 */
public interface TopicService {
    //1.查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic);
}
