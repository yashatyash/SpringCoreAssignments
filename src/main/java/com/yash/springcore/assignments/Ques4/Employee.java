package com.yash.springcore.assignments.Ques4;

public class Employee {

    int eId;
    String eName;
    double salary;

    Department department;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void employeeDetail() {
        System.out.println("Department Detail :");
        System.out.println(department);
        System.out.println("Employee id : "+ eId);
        System.out.println("Employee name : "+ eName);
        System.out.println("Employee Salary : "+salary);
    }
}
