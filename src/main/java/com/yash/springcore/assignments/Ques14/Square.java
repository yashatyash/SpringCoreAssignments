package com.yash.springcore.assignments.Ques14;

public class Square implements Shape {

    @Override
    public void area(int a) {
        int a1=a*a;
        System.out.println("Area of Square = "+a1);
    }

    @Override
    public void side() {
        System.out.println("Side of square = "+4);
    }
}