package io.dowlath.dsa.leetcode.tricky_questions;

/*
           O/P :

                    Exception in thread "main" java.lang.StackOverflowError
	                at io.dowlath.dsa.leetcode.tricky_questions.Stack_Over_Flow_Error.<init>(Stack_Over_Flow_Error.java:9)
	                at io.dowlath.dsa.leetcode.tricky_questions.Stack_Over_Flow_Error.<init>(Stack_Over_Flow_Error.

	                Because of inside the class we are calling as recursively it is running.
	                How to avoid this error.

	                If you use static , it will resolve.

	                static Stack_Over_Flow_Error stackOverFlowError = new Stack_Over_Flow_Error();

	       O/P :

	                Hello
                    Hello
 */
public class Stack_Over_Flow_Error {

    Stack_Over_Flow_Error(){
        System.out.println("Hello");
    }

    static Stack_Over_Flow_Error stackOverFlowError = new Stack_Over_Flow_Error();

    public static void main(String[] args) {
        Stack_Over_Flow_Error stack = new Stack_Over_Flow_Error();
    }
}
