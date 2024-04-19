package io.dowlath.dsa.leetcode.tricky_questions;

/*
 O/P :  Double Array

 if i use String, Integer ambious issue will come.
 */
public class Function_Overloading_Confusing {

    public Function_Overloading_Confusing(Object o){
        System.out.println("Object");

    }

    public Function_Overloading_Confusing(double[] dArray){
        System.out.println("Double Array");
    }

   /* public Function_Overloading_Confusing(String s){
        System.out.println("String");
    }

    public Function_Overloading_Confusing(Integer i){
        System.out.println("Integer");
    }*/

    public static void main(String[] args) {
        Function_Overloading_Confusing confuse = new Function_Overloading_Confusing(null);
    }
}
