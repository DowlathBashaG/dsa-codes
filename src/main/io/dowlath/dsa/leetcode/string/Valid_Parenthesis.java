package io.dowlath.dsa.leetcode.string;

import java.util.Stack;

/*
     1.

     I/P :

         ()[]{}()[]{}

     O/P :

          true

     2.

     I/P :

         ()]]

     O/P :

         false
  Note :

  SUCCESS : true   FAILURE : false
 */
public class Valid_Parenthesis {
    public static void main(String[] args) {
        String success_case = "()[]{}()[]{}";
        String failure_case = " ()]]";
        boolean isItValidParenthesis_successCase = isItValidParenthesis(success_case);
        boolean isItValidParenthesis_failureCase = isItValidParenthesis(failure_case);
        System.out.println("SUCCESS : "+isItValidParenthesis_successCase+"   "+"FAILURE : "+isItValidParenthesis_failureCase);
    }

    private static boolean isItValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for( char c : s.toCharArray()){
            if( c == '{' || c == '('|| c == '[' ) {
                stack.push(c);
            } else if ( c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if ( c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }

}
