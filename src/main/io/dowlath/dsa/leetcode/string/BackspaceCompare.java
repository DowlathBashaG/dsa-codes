package io.dowlath.dsa.leetcode.string;

import java.util.Stack;

/*
    1.
       I/P :

              String S = "ab#c"; // ab##  // a##c
              String T = "ad#c";  // c#d#  //  #a#c
       O/P :
              true

    2.

       I/P :
              S = "a#c"
              T = "b"
       O/P :
              false
 */
public class BackspaceCompare {
    public static void main(String[] args) {
        String S = "ab#c"; // ab##  // a##c
        String T = "ad#c";  // c#d#  //  #a#c
        System.out.println("Backspace Compare String .... : "+ backspaceCompare(S,T));

    }

    private static boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!first.isEmpty()){
                    first.pop();
                }
            } else {
                first.push(c);
            }
        }

        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!second.isEmpty()){
                    second.pop();
                }
            } else {
                second.push(c);
            }
        }

        while(!first.isEmpty()){
            char cur = first.pop();
            if(second.isEmpty() || cur != second.pop()){
                return false;
            }
        }
        return second.isEmpty();
    }
}
