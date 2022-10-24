package com.chilun.qqzone.dao;

import com.chilun.qqzone.pojo.Reply;
import com.chilun.qqzone.pojo.Topic;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-12-23:12
 */
public interface ReplyDAO {
    //1.获得指定日志回复列表
    List<Reply> getReplyList(Topic topic);
    //2.添加回复
    void addReply(Reply reply);
    //3.删除回复
    void delReply(Integer id);

}
