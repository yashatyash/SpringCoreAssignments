package com.yash.springcore.assignments.Ques10;

//WAP to inject student name and marks into spring bean, and you have to use hashmap.
// Use key as student name and marks as value. And sort all the data and print the records.
// For example, you can inject map in following way.
//<map>
//<entry key-ref="sunil" value-ref="350"></entry>
//<entry key-ref="anil" value-ref="401"></entry>
//</map>

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques10 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ques10/Ques10.xml");
        Student student = (Student) context.getBean("student");
        student.getStd();
    }
}
