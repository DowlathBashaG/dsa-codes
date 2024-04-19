package io.dowlath.dsa.leetcode.tricky_questions;

/*
     O/P :   Static Method

     internally A.staticMethod is calling. looks like which checking byte code :
     a.staticMethod(); =>  A.staticMethod();
 */
class A{
    static void staticMethod(){
        System.out.println("Static Method");
    }
}
public class Static_Null_Test {
    public static void main(String[] args) {
        A a = null;
        a.staticMethod();
    }
}
