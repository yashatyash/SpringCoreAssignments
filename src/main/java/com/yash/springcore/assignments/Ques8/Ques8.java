package com.yash.springcore.assignments.Ques8;

//WAP inject list of item to bean and after this arrange all of the, item name in ascending and descending order.
// Also remove any duplicate name of item if present.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques8 {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("Ques8/Ques8.xml");
        Item i1=(Item) obj.getBean("ques8");
        i1.show();
        System.out.println("============");
        i1.ascending();
        System.out.println("===========");
        i1.descending();
        System.out.println("================");
        i1.removeDuplicate();
    }
}
