package io.dowlath.dsa.leetcode.array;

public class Swap_Two_Numbers_Without_Temp {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("Before swapping ... :");
        System.out.println(" X : "+ x + "  Y : " + y);
        swap(x,y);
    }
    static void swap(int x, int y){
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping ... :");
        System.out.println(" X : "+ x + "  Y : "+y);
    }
}
