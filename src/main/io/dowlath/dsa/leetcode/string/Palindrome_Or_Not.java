package io.dowlath.dsa.leetcode.string;

import java.util.Scanner;

/*
      I/P : madam
      O/P : Is it palindrome or not .... : true
*/
public class Palindrome_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Is it palindrome or not .... : "+isPalindrome(s,0,s.length()-1));
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if (s.charAt(i) != s.charAt(j)){
            return false;
        }
        if( j <= i){
            return true;
        }
        return isPalindrome(s,i+1,j-1);

    }

}
