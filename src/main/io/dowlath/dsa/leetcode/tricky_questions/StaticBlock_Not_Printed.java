package io.dowlath.dsa.leetcode.tricky_questions;

/*
         O/P :
               100

         Note:
               static block not called. because of final keyword.
               if you remove final , it will call static block.

 */

public class StaticBlock_Not_Printed {
    public static void main(String[] args) {
        System.out.println(T.x);
    }
}

class T{
    public static final int x = 100;
    static{
        System.out.println("Inside T class static block");
    }
}
