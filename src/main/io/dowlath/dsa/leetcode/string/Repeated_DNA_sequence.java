package io.dowlath.dsa.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeated_DNA_sequence {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAAA";
        List<String> list = repeatedDnaSequece(s);
        for( String str : list){
            System.out.println(str);
        }
    }

    private static List<String> repeatedDnaSequece(String s) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String subString = s.substring(i,i+10);
            map.put(subString,map.getOrDefault(subString,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> item : map.entrySet()){
            if(item.getValue() > 1){
              list.add(item.getKey() );
            }
        }
        return list;
    }
}
