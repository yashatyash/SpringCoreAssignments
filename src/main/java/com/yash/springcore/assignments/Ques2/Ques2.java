package com.yash.springcore.assignments.Ques2;

//WAP in spring core to read the data using post_construct annotated method by user and perform calculation of average of numbers.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques2 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ques2/Ques2.xml");
        AverageNum avgNum = context.getBean("avgID", AverageNum.class);
        avgNum.avgNum();
    }
}
