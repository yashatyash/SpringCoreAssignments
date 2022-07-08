package com.yash.springcore.assignments.Ques10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private HashMap<String, Integer> std;

    public Student() {
        super();
    }

    public Map<String, Integer> getStd() {

        Map<String, Integer> tempMap = std.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1, e2) -> e1, LinkedHashMap :: new));
        System.out.println(tempMap);
        return std;
    }

    public void setStd(HashMap<String, Integer> std) {
        this.std = std;

    }
}