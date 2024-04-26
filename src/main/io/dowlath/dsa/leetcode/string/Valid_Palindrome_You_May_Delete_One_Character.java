package io.dowlath.dsa.leetcode.string;


public class Valid_Palindrome_You_May_Delete_One_Character {
    public static void main(String[] args) {
        String s = "abca"; // "abc";
        System.out.println("Is it Palindrome .... : " + validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            } else {
                return validPalindrome(s.substring(start+1, end+1)) ||
                        validPalindrome(s.substring(start,end));
            }
        }
        return true;
    }

    public boolean validPalindromeHelper(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
