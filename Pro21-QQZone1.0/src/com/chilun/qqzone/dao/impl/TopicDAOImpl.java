package com.chilun.qqzone.dao.impl;

import com.chilun.myssm.basedao.BaseDAO;
import com.chilun.qqzone.dao.TopicDAO;
import com.chilun.qqzone.pojo.Topic;
import com.chilun.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:31
 */
public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author = ?", userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic(Integer id) {
        return null;
    }
}
