package io.dowlath.java8.java8_streams_exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
      I/P :

      Null present :  "apple",null,"banana","cherry"

      O/P :

      Non Null Words are present in the list.... : [apple, banana, cherry]
 */
public class Exception_Handling_In_Streams_Java8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple",null,"banana","cherry");
        List<String> nonNullWords = words
                                   .stream()
                                   .filter(word -> {
                                       try{
                                           return word != null && word.length() > 0;
                                       } catch(Exception e){
                                           // Handle the exception
                                           return false;
                                       }
                                   })
                                   .collect(Collectors.toList());
        System.out.println("Non Null Words are present in the list.... : "+nonNullWords);
    }
}
