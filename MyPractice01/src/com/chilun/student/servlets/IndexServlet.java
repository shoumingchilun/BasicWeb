package com.chilun.student.servlets;

import com.chilun.myssm.myspringmvc.ViewBaseServlet;
import com.chilun.student.dao.StudentDAO;
import com.chilun.student.dao.impl.StudentDAOImpl;
import com.chilun.student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-08-14:26
 */
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Integer pageNo = 1;

        String oper = req.getParameter("oper");
        String keyword = null;
        if (oper != null && !oper.equals("") && oper.equals("search")) {
            pageNo = 1;
            keyword = req.getParameter("keyword");
            if (keyword == null || keyword.equals("")) {
                keyword = "";
            }
            session.setAttribute("keyword", keyword);
        } else {
            String pageNoStr = req.getParameter("pageNo");
            if (pageNoStr != null && !pageNoStr.equals("")) {
                pageNo = Integer.valueOf(pageNoStr);
            }
            Object keywordObj = session.getAttribute("keyword");
            if (keywordObj != null) {
                keyword = (String) keywordObj;
            } else {
                keyword = "";
            }
        }

        session.setAttribute("pageNo", pageNo);
        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> list = studentDAO.getStudentList(keyword, pageNo);

        session.setAttribute("studentList", list);
        int studentCount = studentDAO.getStudentCount(keyword);
        int pageCount = (studentCount + 15 - 1) / 15;

        session.setAttribute("pageCount",pageCount);
        super.processTemplate("index", req, resp);
    }
}
