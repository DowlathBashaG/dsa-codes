package io.dowlath.java8.java8_sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
        O/P : Sorted Elements ... : [1, 3, 4, 9, 10, 67]
 */
public class Sort_Elements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,9,4,10,67,1);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Elements ... : "+ sortedNumbers);
    }
  }

