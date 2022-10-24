package com.chilun.Fruit.servlets;

import com.chilun.Fruit.dao.FruitDAO;
import com.chilun.Fruit.dao.FruitDAOImpl;
import com.chilun.Fruit.pojo.Fruit;
import com.chilun.myssm.myspringmvc.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-05-15:17
 */
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FruitDAO fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList();

        HttpSession session = req.getSession();
        session.setAttribute("FruitList",fruitList);
        super.processTemplate("index",req,resp);

    }
}
