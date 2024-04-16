package io.dowlath.dsa.leetcode.string;

import java.util.Locale;

public class Check_Is_It_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama"; // race a car -> return false
        System.out.println("Given string is palindrome ... : "+ isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String newString = "";
        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                newString +=c;
            }
        }
        newString = newString.toLowerCase();

        int start = 0;
        int end = newString.length()-1;
        while(start < end){
            if(newString.charAt(start) != newString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
