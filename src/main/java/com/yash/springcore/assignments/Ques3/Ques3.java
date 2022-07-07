package com.yash.springcore.assignments.Ques3;

//WAP to print No of EMI for a given amount of loan for a given number of years or month.
// You have to fetch the interest rate from the xml file and loam amount and rate of interest is entered by you.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ques3/Ques3.xml");

        Emi emi = context.getBean("emiID", Emi.class);

        System.out.println("Interest Rate : "+emi.rate + "%");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        float amount = sc.nextFloat();

        System.out.println("Enter validity in Year : ");
        int validity = sc.nextInt();

        int validityInMonths = validity*12;

        double TPA = amount + ((amount * emi.rate)/100) * validity;
        System.out.println("Total payable amount : "+TPA);

        double emiPM = TPA/validityInMonths;
        System.out.println("EMI for total amount : "+emiPM);

    }
}
