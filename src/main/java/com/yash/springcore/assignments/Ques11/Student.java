package com.yash.springcore.assignments.Ques11;

public class Student {
    String studentName;
    int rollNo;
    String dob;
    String className;
    String section;
    Result res;

    public Student(String studentName, int rollNo, String dob, String className, String section, Result res) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.dob = dob;
        this.className = className;
        this.section = section;
        this.res = res;
    }
}
