package com.chilun.student.pojo;

/**
 * @auther 齿轮
 * @create 2022-05-08-12:07
 */
public class Student {
    private String ID;
    private String studentID;
    private String name;
    private String gender;
    private String studentSort;
    private String majorName;
    private String studentClass;
    private String idCard;
    private String contactAddress;
    private String others;

    public Student(String ID, String studentID, String name, String gender, String studentSort, String majorName, String studentClass, String idCard, String contactAddress, String others) {
        this.ID = ID;
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.studentSort = studentSort;
        this.majorName = majorName;
        this.studentClass = studentClass;
        this.idCard = idCard;
        this.contactAddress = contactAddress;
        this.others = others;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", studentSort='" + studentSort + '\'' +
                ", majorName='" + majorName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", idCard='" + idCard + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentSort() {
        return studentSort;
    }

    public void setStudentSort(String studentSort) {
        this.studentSort = studentSort;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Student(String studentID, String name, String gender, String studentSort, String majorName, String studentClass, String idCard, String contactAddress, String others) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.studentSort = studentSort;
        this.majorName = majorName;
        this.studentClass = studentClass;
        this.idCard = idCard;
        this.contactAddress = contactAddress;
        this.others = others;
    }

    public Student() {
    }
}

