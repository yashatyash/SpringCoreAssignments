package com.yash.springcore.assignments.Ques2;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

public class AverageNum {
    List<Integer> num;

    @Override
    public String toString() {
        return "AverageNum [num=" + num + "]";
    }
    public List<Integer> getNum() {
        return num;
    }
    public void setNum(List<Integer> num) {
        this.num = num;
    }

    @PostConstruct
    public void avgNum() {
        Double avg = num.stream().collect(Collectors.averagingDouble(i -> i));
        System.out.println("Average of number : "+avg);

    }
}
