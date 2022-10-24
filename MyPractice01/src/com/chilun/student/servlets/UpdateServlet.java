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
 * @create 2022-05-08-15:35
 */
@WebServlet("/update.do")
public class UpdateServlet extends ViewBaseServlet {
    private StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String ID = req.getParameter("ID");
        String name = req.getParameter("name");
        String studentID = req.getParameter("studentID");
        String gender = req.getParameter("gender");
        String studentSort = req.getParameter("studentSort");
        String majorName = req.getParameter("majorName");
        String studentClass = req.getParameter("studentClass");
        String idCard = req.getParameter("idCard");
        String contactAddress = req.getParameter("contactAddress");
        String others = req.getParameter("others");


        studentDAO.updateStudent(new Student(ID, studentID, name, gender, studentSort, majorName, studentClass, idCard, contactAddress, others));
        resp.sendRedirect("index");
    }
}
