package io.dowlath.dsa.leetcode.string;
/*
       I/P  :
               SILENT , LISTEN

       O/P  :  true
 */

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "SILENT";
        String s2 = "LISTEN";

        // 1. make it as lowercase -> given strings

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // 2. Check the length is it same or not

        if(s1.length() == s2.length()){

        // 3. convert string to char array

         char[] charArrayS1 = s1.toCharArray();
         char[] charArrayS2 = s2.toCharArray();

        // 4. sorted char arrays are same then string is anagram

         Arrays.sort(charArrayS1);
         Arrays.sort(charArrayS2);

         boolean result = Arrays.equals(charArrayS1,charArrayS2);
         if(result){
             System.out.println(s1+" and "+ s2+" are anagram ");
              } else {
             System.out.println(s1+" and "+ s2+" are not anagram ");
         }

     } else {
       System.out.println(s1 + " and "+ s2 +" are not anagram");
     }
  }
}
