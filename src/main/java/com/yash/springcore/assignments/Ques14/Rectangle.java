package com.yash.springcore.assignments.Ques14;

public class Rectangle implements Shape {

    public void area(int a, int b) {
        int s = a * b;
        System.out.println("Area of rectangle = " + s);
    }

    @Override
    public void area(int a) {
        // TODO Auto-generated method stub

    }

    @Override
    public void side() {
        System.out.println("Side of Rectangular = " + 4);
    }
}
