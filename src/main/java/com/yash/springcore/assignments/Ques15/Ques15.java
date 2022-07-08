package com.yash.springcore.assignments.Ques15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Ques15 {
    public static void main(String[] args) {
        List<Customer> slist =new ArrayList<Customer>();
        ApplicationContext obj = new ClassPathXmlApplicationContext("Ques15/Ques15.xml");
        Customer c=(Customer) obj.getBean("CustID");
        c.display();
    }
}
