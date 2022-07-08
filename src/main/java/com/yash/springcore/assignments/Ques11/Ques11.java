package com.yash.springcore.assignments.Ques11;

//WAP in spring core where we will inject dependent object of result class in student class.
// In student class following fields will be present studentname, rollno, date of birth, classname, section.
// Result class will have the following fields, rollno, maths,hindi,English, science, as subject name.
// Create five bean of each and inject the bean as per roll no. Now you need to load the bean from container.
// Load all the objects in List and filter the data on the basis of total marks obtain by each student.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Ques11 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        ApplicationContext obj = new ClassPathXmlApplicationContext("Ques11/Ques11.xml");
        Student e1 = (Student) obj.getBean("student1");
        Student e2 = (Student) obj.getBean("student2");

        studentList.add(e1);
        studentList.add(e2);
        for(Student s :studentList) {
            System.out.println(s.studentName+" "+s.res.totalMarks);

        }
        System.out.println("On the basis of total marks");
        List<Student> sortedlist = studentList.stream().sorted((s1, s2) -> Double.compare(s1.res.totalMarks, s2.res.totalMarks)).toList();
        for (Student w : sortedlist) {
            System.out.println(w.res.totalMarks);
        }
    }
}