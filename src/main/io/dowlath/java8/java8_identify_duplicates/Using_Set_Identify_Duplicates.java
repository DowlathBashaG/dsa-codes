package io.dowlath.java8.java8_identify_duplicates;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
      O/P : [59, 13]
 */
public class Using_Set_Identify_Duplicates {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5,13,4,21,13,27,2,59,59,34);
        System.out.println(findDuplicateInStream(stream));
    }

    private static <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        Set<T> items = new HashSet<>();
        return stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
    }
}
