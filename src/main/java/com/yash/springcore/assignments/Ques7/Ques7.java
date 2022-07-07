package com.yash.springcore.assignments.Ques7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques7 {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("que7.xml");
        Arr1 obj1= (Arr1) obj.getBean("que7a");
        obj1.merge();
    }
}
