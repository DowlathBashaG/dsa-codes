package io.dowlath.java8.java8_map_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
       O/P :   Flat Map Values ... : [1, 2, 3, 4]
 */
public class FlatMap_Demo {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        List<Integer> flattenedList = listOfLists.stream()
                                                  .flatMap(List::stream)
                                                  .collect(Collectors.toList());
        System.out.println("Flat Map Values ... : "+ flattenedList);
    }
}
