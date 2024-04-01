package io.dowlath.dsa.leetcode.string;
/*
     I/P
          Dowlath

     O/P
         htalwoD
 */

import java.util.Stack;

public class Reverse_String_Using_Stack {
    public static void main(String[] args) {
        String s = "Dowlath";
        System.out.println("The Reverse String ... : "+ reverseString(s));
    }

    private static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i=0;i<s.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
