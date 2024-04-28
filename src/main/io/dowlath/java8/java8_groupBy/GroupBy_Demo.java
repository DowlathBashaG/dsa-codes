package io.dowlath.java8.java8_groupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
     O/P  :  Group By Length ... : {3=[Bob], 4=[John, Jane], 5=[Alice]}
 */
public class GroupBy_Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Alice","Bob","Jane");
        Map<Integer,List<String>> groupByLength = names.stream()
                                                        .collect(Collectors.groupingBy(String::length));
        System.out.println("Group By Length ... : "+ groupByLength);
    }
}
