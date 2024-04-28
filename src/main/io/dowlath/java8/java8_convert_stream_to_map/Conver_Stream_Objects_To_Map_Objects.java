package io.dowlath.java8.java8_convert_stream_to_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Conver_Stream_Objects_To_Map_Objects {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dowlath","Ariz","Arsh","Naveeda");
        Map<String,Integer> nameLengthMap = names.stream()
                                                 .collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println("The Map Objects ... : "+ nameLengthMap);
    }
}
