package io.dowlath.dsa.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        List<String> fizzBuzzList = fizzBuzz(n);
        for(String list : fizzBuzzList){
            System.out.print(list+ " ");
        }
    }

    private static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if( i % 3 == 0 && i % 5 == 0 ){
                result.add("FizzBuzz");
            } else if (i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0 ){
                result.add("Buzz");
            } else {
                result.add(i+ " ");
            }
        }
        return result;
    }

}
