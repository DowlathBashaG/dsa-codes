package io.dowlath.dsa.leetcode.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
       I/P :
                 m = 6
                 cost = {1,3,5,6}
       O/P :

                [1, 4]

 */
public class IceCreamParlor {
    static ArrayList<Integer> iceCreamParlour(int m, ArrayList<Integer> ar){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<ar.size()-1;i++){
            for(int j= i+1; j<ar.size();j++){
                if(ar.get(i)+ar.get(j) == m){
                    result.add(i+1);
                    result.add(j+1);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
      ArrayList<Integer> result = new ArrayList<>();
      ArrayList<Integer> ar = new ArrayList<>();
      ar.add(1);
      ar.add(3);
      ar.add(4);
      ar.add(5);
      ar.add(6);
      result = iceCreamParlour(6,ar);
      System.out.println(result);
    }
}
