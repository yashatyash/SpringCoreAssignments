package com.yash.springcore.assignments.Ques4;

//WAP to perform demonstrate autowire.
// Use Two classes, first class Employee, second department now store all employee and department details.
// Print employee details in order by employee salary .

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();


        ApplicationContext context = new ClassPathXmlApplicationContext("Ques4/Ques4.xml");

        Employee employee1 = context.getBean("eId1" , Employee.class);

        Employee employee2 = context.getBean("eId2" , Employee.class);

        list.add(employee1);
        list.add(employee2);

        List<Employee> sorted = list.stream().sorted((e1 , e2) -> Double.compare(e1.salary, e2.salary)).toList();

        System.out.println("Print employee Details Order by salary");
        for (Employee employee : sorted) {
            System.out.println();
            employee.employeeDetail();
        }
    }
}
