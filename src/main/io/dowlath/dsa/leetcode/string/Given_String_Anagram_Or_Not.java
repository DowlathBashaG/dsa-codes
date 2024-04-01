package io.dowlath.dsa.leetcode.string;
/*
      I/P :
             silent
             listen

             incest
             insect

             lives
             elvis

             cat
             act

             rat
             art


      O/P :
             true

 */

import java.util.Arrays;

public class Given_String_Anagram_Or_Not {
    public static void main(String[] args) {
        String st1 = "silent";
        String st2 = "listen";
        boolean isItAnagram = isItAnagram(st1, st2);
        System.out.println("The Given Strings are Anagram .... : "+ isItAnagram);
    }

    private static boolean isItAnagram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char c1[] = str1.toLowerCase().toCharArray();
            char c2[] = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }

}
