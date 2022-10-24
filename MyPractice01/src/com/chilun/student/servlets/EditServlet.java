package com.chilun.student.servlets;

import com.chilun.myssm.myspringmvc.ViewBaseServlet;
import com.chilun.student.dao.StudentDAO;
import com.chilun.student.dao.impl.StudentDAOImpl;
import com.chilun.student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther 齿轮
 * @create 2022-05-08-14:55
 */
@WebServlet("/edit.do")
public class EditServlet extends ViewBaseServlet {
    private StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentID = req.getParameter("id");
        if (studentID != null && !studentID.equals("")) {
            Student student = studentDAO.getFruitByID(studentID);
            req.setAttribute("student", student);
            super.processTemplate("Edit", req, resp);
        }
    }
}
