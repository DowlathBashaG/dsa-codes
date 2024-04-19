package io.dowlath.dsa.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicates_From_Given_String {
    public static void main(String[] args) {
        String s = "Basha";
        int n = s.length();
        System.out.println(removeDuplicates(s.toCharArray(),n));
    }
    static char[] removeDuplicates(char[] s , int n){
        Map<Character,Integer> exists = new HashMap<>();
        String st = "";
        for(int i=0;i<n;i++){
            if(!exists.containsKey(s[i])){
                st = st + s[i];
                exists.put(s[i],i);
            }
        }
        return st.toCharArray();
    }
}
