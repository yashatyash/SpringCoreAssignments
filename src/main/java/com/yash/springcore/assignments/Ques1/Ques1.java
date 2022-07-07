package com.yash.springcore.assignments.Ques1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques1 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ques1/Ques1.xml");

        Role role = context.getBean("roleID", Role.class);
        role.msg();
    }
}
