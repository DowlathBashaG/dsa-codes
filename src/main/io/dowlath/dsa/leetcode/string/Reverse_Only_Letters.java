package io.dowlath.dsa.leetcode.string;

/*
       I/P :  ab-cd
       O/P :  Reverse Only Letters ... : dc-ba
 */

public class Reverse_Only_Letters {
    public static void main(String[] args) {
        String s = "ab-cd";
        Reverse_Only_Letters reverseOnlyLetters = new Reverse_Only_Letters();
        System.out.println("Reverse Only Letters ... : " + reverseOnlyLetters.reverseOnlyLetters(s));
    }

    private String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] chars = s.toCharArray();
        while(start < end){
            while(start < end && !Character.isLetter(chars[start])) start++;
            while(start < end && !Character.isLetter(chars[end])) end--;
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
