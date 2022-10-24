package com.chilun.Fruit.dao;

import com.chilun.Fruit.pojo.Fruit;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-05-15:06
 */
public interface FruitDAO {
    //获取所有库存列信息
    List<Fruit> getFruitList();
}
