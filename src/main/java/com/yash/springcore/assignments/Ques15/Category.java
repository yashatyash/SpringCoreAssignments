package com.yash.springcore.assignments.Ques15;

public class Category {
    String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void catShow() {
        System.out.println("Category name is ="+ catName);
    }
}
