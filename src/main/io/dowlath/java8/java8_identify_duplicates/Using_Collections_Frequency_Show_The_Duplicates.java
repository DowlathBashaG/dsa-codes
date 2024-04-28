package io.dowlath.java8.java8_identify_duplicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*
       O/P : 3
             4
 */
public class Using_Collections_Frequency_Show_The_Duplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,4,1,3,7,2,9,4);
        Set<Integer> result = findDuplicateByFrequency(list);
        result.forEach(System.out::println);
    }

    private static Set<Integer> findDuplicateByFrequency(List<Integer> list) {
        return list.stream().filter( i-> Collections.frequency(list,i) > 1)
                   .collect(Collectors.toSet());
    }
}
