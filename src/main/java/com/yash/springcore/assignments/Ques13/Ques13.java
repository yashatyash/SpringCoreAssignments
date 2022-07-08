package com.yash.springcore.assignments.Ques13;

//WAP in which you have to create a system where movie name, show time and price of ticket per show will be injected.
// Your job is to find out how a movie eared during a particular time slot means movie Radhe time slot 12-3 earned for current week 10 crore.
// Similarly for other time slot you need to print the details.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques13 {
    public static void main(String[] args) {

        ApplicationContext obj = new ClassPathXmlApplicationContext("Ques13/Ques13.xml");
        MovieDetails movieDetails=(MovieDetails) obj.getBean("cust1");
        movieDetails.show();
    }
}
