package com.yash.springcore.assignments.Ques15;

//WAP in which three beans need to be created item, category and customer.
// Category injected in item and item injected in customer.
// Now print all item purchased by customer.

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
