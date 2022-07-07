package com.yash.springcore.assignments.Ques1;

public class Role {
    private Role() {
    }

    public static Role getRole() {
        return new Role();
    }

    public void msg() {
        System.out.println("Role Based Object is Created");
    }
}
