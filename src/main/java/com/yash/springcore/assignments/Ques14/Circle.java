package com.yash.springcore.assignments.Ques14;

public class Circle implements Shape {
    @Override
    public void area(int a) {
        double area;
        System.out.println("area of Circle");
        System.out.println(area=3.14*(a*a));
    }

    @Override
    public void side() {
        System.out.println("side of circle is = "+0);
    }
}