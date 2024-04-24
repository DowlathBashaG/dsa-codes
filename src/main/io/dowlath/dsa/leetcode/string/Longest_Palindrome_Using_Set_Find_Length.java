package io.dowlath.dsa.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/*
      O/P : Longest Palindrome String length ... :  7
 */
public class Longest_Palindrome_Using_Set_Find_Length {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println("Longest Palindrome String length ... :  "+longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int pairs = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                pairs++;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        pairs = pairs * 2;
        if(!set.isEmpty()) pairs++;
        return pairs;
    }
}
