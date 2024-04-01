package io.dowlath.dsa.leetcode.string;

public class Length_Of_Last_String {
    public static void main(String[] args) {
        String s = "This is java program welcomes to you";
        int length_of_last_word = lengthOfLastWord(s);
        System.out.println("The length of last word ... : "+ length_of_last_word);
    }

    private static int lengthOfLastWord(String s) {
        int right = s.length()-1;
        while(right >= 0 && s.charAt(right) == ' '){
            right--;
        }
        int left = right;
        while(left >=0 && s.charAt(left) != ' '){
            left--;
        }
        return right - left;
    }
}
