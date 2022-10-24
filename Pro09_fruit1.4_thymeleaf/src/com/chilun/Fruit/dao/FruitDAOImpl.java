package com.chilun.Fruit.dao;

import com.chilun.Fruit.pojo.Fruit;
import com.chilun.myssm.baseDAO.BaseDAO;
import org.junit.Test;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-05-15:07
 */
public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    @Override
    public List<Fruit> getFruitList() {
        return super.executeQuery("select * from t_fruit");
    }
//    @Test
//    public void test(){
//        System.out.println(getFruitList());
//    }
}
