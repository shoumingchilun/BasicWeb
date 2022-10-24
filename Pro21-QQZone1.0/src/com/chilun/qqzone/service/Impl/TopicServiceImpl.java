package com.chilun.qqzone.service.Impl;

import com.chilun.qqzone.dao.TopicDAO;
import com.chilun.qqzone.pojo.Topic;
import com.chilun.qqzone.pojo.UserBasic;
import com.chilun.qqzone.service.TopicService;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:53
 */
public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO = null;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
