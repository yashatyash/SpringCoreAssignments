package com.yash.springcore.assignments.Ques12;

//WAP in which you will enter employee detail and department names. Now you have to found the following.
//a. Find maximum salary in a department.
//b. Print name of employees having highest salary
//c. Name of employee having salary less than or equal to average salary.
//d. Average salary of each department.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ques12 {
    public static void main(String[] args) {

        List<Employee> sList = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        ApplicationContext ctxObj = new ClassPathXmlApplicationContext("Ques12/Ques12.xml");

        Employee ct1 = (Employee) ctxObj.getBean("emp1");
        Employee ct2 = (Employee) ctxObj.getBean("emp2");
        Employee ct3 = (Employee) ctxObj.getBean("emp3");
        Employee ct4 = (Employee) ctxObj.getBean("emp4");
        sList.add(ct1);
        sList.add(ct2);
        sList.add(ct3);
        sList.add(ct4);

        System.out.println("enter the department");
        String dept1 = sc.next();
        Employee e3=sList.stream().filter(s->s.department.equals(dept1)).max((e1,e2)->e1.salary>e2.salary ? 1:-1).get();
        System.out.println("name is "+ e3.eName+" has" + " Maximum salary = " + e3.salary);

        System.out.println("===================================");

        System.out.print("Employee has highest salary is ");
        Employee max = sList.stream().max((e1, e2) -> e1.salary > e2.salary ? 1 : -1).get();
        System.out.println(max.toString());

        System.out.println("===========================================");

        Double avg = sList.stream().collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println("Average salary is"+avg);
        List<Employee> average= sList.stream().filter(i->i.salary< avg).toList();
        for(Employee e:average) {

            System.out.println(e.eName+" "+e.salary);
        }

        System.out.println("============================");

        List<String> department=sList.stream().map(r->r.department).distinct().toList();
        for(String d:department) {
            Double avg1=sList.stream().filter(e->e.department.equals(d)).collect(Collectors.averagingDouble(e->e.salary));
            System.out.println("Average Salary = "+avg1+", Department = "+d);
        }
    }
}
