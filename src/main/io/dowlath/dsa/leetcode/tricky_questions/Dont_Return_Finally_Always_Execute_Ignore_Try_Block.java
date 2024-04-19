package io.dowlath.dsa.leetcode.tricky_questions;

/*
             O/P :  0
                 1. It consumes exception but return finally block value.
                 2. return 5 in try block and return 0 in finally block will print only finally black.
 */

public class Dont_Return_Finally_Always_Execute_Ignore_Try_Block {
    public static void main(String[] args) {
        System.out.println(doSomeThing());
    }

    private static int doSomeThing() {
        try{
            //1.
            //throw new RuntimeException("Dowlath.....!!!");

            //2.
            return 5;
        }finally{
            return 0;
        }
    }
}
