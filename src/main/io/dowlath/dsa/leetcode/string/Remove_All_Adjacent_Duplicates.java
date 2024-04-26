package io.dowlath.dsa.leetcode.string;

import java.util.Stack;

/*
      I/P : The Given String ... : abbaca
      O/P : After removed adjacent duplicates ... : ca
 */
public class Remove_All_Adjacent_Duplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println("The Given String ... : "+ s);
        System.out.println("After removed adjacent duplicates ... : "+ removeAdjacentDuplicates(s));
    }

    private static String removeAdjacentDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
