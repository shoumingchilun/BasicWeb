package com.chilun.student.dao.impl;

import com.chilun.myssm.baseDao.BaseDAO;
import com.chilun.student.dao.StudentDAO;
import com.chilun.student.pojo.Student;
import org.junit.Test;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-05-08-12:06
 */
public class StudentDAOImpl extends BaseDAO<Student> implements StudentDAO {
    @Override
    public List<Student> getStudentList(String keyword, Integer pageNo) {//关键字为姓名关键字
        return super.executeQuery("select ID,studentID,name,gender,studentSort,majorName,class studentClass,idCard,contactAddress,others " +
                "from student where name like ? limit ? , 15", "%" + keyword + "%", (pageNo - 1) * 15);
    }

    @Override
    public Student getFruitByID(String ID) {
        return super.load("select ID,studentID,name,gender,studentSort,majorName,class studentClass,idCard,contactAddress,others from student where ID = ? ", ID);
    }
    //ID,studentID,name,gender,studentSort,majorName,studentClass,idCard,contactAddress,others

    @Override
    public void updateStudent(Student student) {
        String sql = "update student set " +
                "studentID = ? ," +
                "name = ? , " +
                "gender = ? , " +
                "studentSort = ? , " +
                "majorName = ? , " +
                "class = ? , " +
                "idCard = ? , " +
                "contactAddress = ? , " +
                "others = ?  " +
                "where ID = ? ";
        super.executeUpdate(sql,
                student.getStudentID(),
                student.getName(),
                student.getGender(),
                student.getStudentSort(),
                student.getMajorName(),
                student.getStudentClass(),
                student.getIdCard(),
                student.getContactAddress(),
                student.getOthers(),
                student.getID());
    }

    @Override
    public int getStudentCount(String keyword) {
        return ((Long) super.executeComplexQuery("select count(*) from student where name like ?", "%" + keyword + "%")[0]).intValue();
    }

    @Test
    public void test1() {
        System.out.println(getStudentList("徐",1));
    }
}
