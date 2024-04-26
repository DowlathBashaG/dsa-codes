package io.dowlath.dsa.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/*
      O/P : [facebook, google, leetcode]
 */
public class Word_Sub_Sets {
    public static void main(String[] args) {
        String[] a = {"amazon","apple","facebook","google","leetcode"};
        String[] b = {"e","o"};
        List<String> res = wordSubSets(a,b);
        System.out.println(res);
    }

    private static List<String> wordSubSets(String[] a, String[] b) {
        List<String> output = new ArrayList<>();
        int[] maxFrequency = new int[26];
        for(String str : b){
            int[] current = new int[26];
            for(char c : str.toCharArray()){
                current[c - 'a']++;
            }
            for(int i=0;i<26;i++){
                maxFrequency[i] = Math.max(maxFrequency[i],current[i]);
            }
        }
        for(String s : a){
            int[] current = new int[26];
            for(char c : s.toCharArray()){
                current[ c - 'a']++;
            }
            for(int i=0;i<26;i++){
                if(maxFrequency[i] > current[i]){
                    break;
                }
                if(i == 25)output.add(s);
            }
        }
        return output;
    }
}
