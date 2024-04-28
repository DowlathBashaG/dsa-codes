package io.dowlath.java8.java8_reduce;

import java.util.Arrays;
import java.util.List;

/*
     The sum of list ... : 15
 */
public class Reduce_Sum_Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println("The sum of list ... : "+ sum);
    }
}
