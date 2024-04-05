package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
     I/P : {1,4,9,10}
     O/P : {10,9,4,1}
 */
public class Reverse_An_Array {
    public static void main(String[] args) {
        int[] a = {1,4,9,10};
        System.out.println("Given Array .. : ");
        System.out.println(Arrays.toString(a));
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }

    private static void reverseArray(int[] a) {
        int i=0,j=a.length-1;
        while( i< j ){
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            j--;
            i++;
        }
    }
}
