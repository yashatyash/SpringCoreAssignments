package com.yash.springcore.assignments.Ques6;

//WAP to inject multiple names to a beans and break the names in to array of string and find out the string which is having no vowel in it.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques6 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ques6/Ques6.xml");
        Vowel vowel = (Vowel) context.getBean("VowelID");
        vowel.checkVowel("Yash Raj ChOudhary");
    }
}
