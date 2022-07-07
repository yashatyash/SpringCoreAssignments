package com.yash.springcore.assignments.Ques6;

public class Vowel{


    public void checkVowel(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Without Vowel String : "+str);
    }

}
