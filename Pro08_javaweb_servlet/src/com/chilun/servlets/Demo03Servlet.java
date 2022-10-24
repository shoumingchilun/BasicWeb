package com.chilun.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @auther 齿轮
 * @create 2022-05-04-19:28
 * <p>
 * 演示Session
 */
public class Demo03Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session，如果获取不到则创建一个新的
        HttpSession session = request.getSession();
        System.out.println("session ID: " + session.getId());
        session.setAttribute("uname","lina");

        int maxInactiveInterval = session.getMaxInactiveInterval();
        System.out.println(maxInactiveInterval);
    }
}
