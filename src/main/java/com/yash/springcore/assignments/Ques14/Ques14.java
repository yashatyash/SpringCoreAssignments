package com.yash.springcore.assignments.Ques14;

//WAP in which you have to create objects on user demands.
// For example, we are having a Interface Shape, now class circle, rectangle and square implements shape interface and shape interface is having two methods.
// Area and sides of the shape. Now user will choose which class object he wants and on the basis of that you need to print the result.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        ApplicationContext ctxobj = new ClassPathXmlApplicationContext("Ques14/Ques14.xml");
        Circle cj = (Circle) ctxobj.getBean("circle");
        Square cj1 = (Square) ctxobj.getBean("square");
        Rectangle cj2 = (Rectangle) ctxobj.getBean("rectangle");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        String ch = sc.next();
        switch (ch) {
            case "Circle":
                cj.area(10);
                break;
            case "Square":
                cj1.area(5);
                break;
            case "Rectangle":
                cj2.area(2, 4);
                break;
            default: System.out.println("Enter valid");
        }
    }
}
