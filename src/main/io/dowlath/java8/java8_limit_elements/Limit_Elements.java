package io.dowlath.java8.java8_limit_elements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
       I/P :  Given List : 1,2,3,4,5
       O/P :  The Limited Numbers ... : [1, 2, 3]
 */
public class Limit_Elements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> limitedNumbers = numbers.stream()
                                              .limit(3).collect(Collectors.toList());
        System.out.println("The Limited Numbers ... : "+ limitedNumbers);
    }
}
