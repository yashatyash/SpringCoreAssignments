package com.yash.springcore.assignments.Ques5;

//WAP to inject n numbers to a bean and find out the maximum out of them using stream operator

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques5 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ques5/Ques5.xml");

        FindMax findMax = context.getBean("maxID", FindMax.class);

        findMax.maxNum();

    }
}
