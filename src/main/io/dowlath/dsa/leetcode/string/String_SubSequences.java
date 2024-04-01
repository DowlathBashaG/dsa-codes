package io.dowlath.dsa.leetcode.string;

import java.util.Scanner;

/*
      I/P :
             abc ->  if length is 3 , 2^3 = 8 combinations of substring.

      O/P :
             abc
             ab
             ac
             a
             bc
             b
             c
             -

 */
public class String_SubSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        subSequences(s,"");
    }

    private static void subSequences(String s, String ans) {

        // Base condition
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        // pick
        subSequences(s.substring(1),ans+s.charAt(0));

        // not pick
        subSequences(s.substring(1),ans);
    }
}
