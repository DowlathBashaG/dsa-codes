package io.dowlath.java8.java8_identify_duplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
    O/P : After Removing Duplicates distinct elements are ...: [1, 2, 3, 4]
 */
public class After_Remove_Duplicate_Distinct_Elements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,2,1);
        List<Integer> distinctElements = list.stream().distinct().collect(Collectors.toList());
        System.out.println("After Removing Duplicates distinct elements are ...: "+ distinctElements);

    }
}
