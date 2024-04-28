package io.dowlath.dsa.leetcode.oops;

/*
       Function Overloading ...rule :

       1. Exact match  (or)
       2. Highest Priority

      O/P : Calling string method
 */
public class MethodOverloadingExample {
    public void methodTest(Object object){
        System.out.println("Calling object method");
    }
    public void methodTest(String s){
        System.out.println("Calling string method");
    }
    public static void main(String[] args) {
        MethodOverloadingExample moe = new MethodOverloadingExample();
        moe.methodTest(null);
    }
}
