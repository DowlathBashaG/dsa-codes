package io.dowlath.dsa.leetcode.java8_interface;

/*
        Two ways we can access the default method from interface.

        1. implement custom own default method (or)
        2. <Interface name>.super.<method name>
           Left.super.m1() /  Right.super.m1();
 */
interface Left{
   default void m1(){
       System.out.println("Left m1()");
        }
}

interface Right{
    default void m1(){
        System.out.println("Right m1()");
    }
}
public class Default_Overridden implements Left,Right{
    public void m1(){
        //System.out.println("Custom own implementation");
        Left.super.m1();
    }
    public static void main(String[] args) {
        Default_Overridden defaultOverridden = new Default_Overridden();
        defaultOverridden.m1();
    }
}
