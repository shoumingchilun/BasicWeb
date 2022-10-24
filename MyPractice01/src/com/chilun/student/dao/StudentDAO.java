package com.chilun.student.dao;

import com.chilun.student.pojo.Student;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-08-12:05
 */
public interface StudentDAO {
    //获取所有的学生列表信息
    List<Student> getStudentList(String keyword , Integer pageNo);

    //根据name获取特定的学生信息
    Student getFruitByID(String ID);

    //修改指定的库存记录
    void updateStudent(Student student);

    //查询库存总记录条数
    int getStudentCount(String keyword);

}
