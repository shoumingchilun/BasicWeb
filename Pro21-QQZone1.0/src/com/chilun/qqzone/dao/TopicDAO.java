package com.chilun.qqzone.dao;

import com.chilun.qqzone.pojo.Topic;
import com.chilun.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:09
 */
public interface TopicDAO {
    //1.获得指定用户日志列表
    public List<Topic> getTopicList(UserBasic userBasic);
    //2.添加日志
    public void addTopic(Topic topic);
    //3.删除日志
    void delTopic(Topic topic);
    //4.获得特定日志信息
    Topic getTopic(Integer id);
}
