package io.dowlath.dsa.leetcode.tricky_questions;

/*
     O/P :
                s = 0
                x = 50
 */
public class PassByValue {
    public static void main(String[] args) {
        int x = 50;
        String s = "0";
        minInt(x,20,10);
        minInt(s,20,10);
        System.out.println("s = "+ s);
        System.out.println("x = "+ x);
    }
    static void minInt(String s1,int a, int b){
        s1 = "500";
    }

    static void minInt(int min, int a, int b){
        min = 100;
    }
}
