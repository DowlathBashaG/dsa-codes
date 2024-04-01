package io.dowlath.dsa.leetcode.string;
/*
                        Dowlath
                        htalwoD
      I/P:
            String s = "Dowlath"

      O/P:
            htalwoD
 */

import java.util.Scanner;

public class Reverse_String_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(reverseString(s,"",s.length()-1));
    }

    private static String reverseString(String s, String r, int i) {

        // base condition
        if(i<0){
            return r;
        }
        return reverseString(s,r+s.charAt(i),i-1);
    }
}
