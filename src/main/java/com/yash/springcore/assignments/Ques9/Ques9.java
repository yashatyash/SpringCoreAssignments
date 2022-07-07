package com.yash.springcore.assignments.Ques9;

//WAP to inject distance between different cities.
// Now user will input two cities name and on the basis of the city name distance will be printed.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        List<Distance> distances = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        ApplicationContext ctxObj = new ClassPathXmlApplicationContext("Ques9/Ques9.xml");

        Distance d1 = (Distance) ctxObj.getBean("city1");
        Distance d2 = (Distance) ctxObj.getBean("city2");
        Distance d3 = (Distance) ctxObj.getBean("city3");
        Distance d4 = (Distance) ctxObj.getBean("city4");

        distances.add(d1);
        distances.add(d2);
        distances.add(d3);
        distances.add(d4);

        System.out.println("enter from city name");
        String fromCity = sc.next();

        System.out.println("enter to city name");
        String toCity = sc.next();

        List<Distance> matchedList = distances.stream()
                .filter(e->e.getFromCity().equalsIgnoreCase(fromCity))
                .filter(e->e.getToCity().equalsIgnoreCase(toCity))
                .collect(Collectors.toList());

        if (!matchedList.isEmpty()) {
            for (Distance cities : matchedList) {
                System.out.print("distance between "+cities.getFromCity() +" & "+cities.getToCity()+" is "+cities.getDistance() + " Km");
            }
        } else
            System.out.println("data not available");
    }
}
