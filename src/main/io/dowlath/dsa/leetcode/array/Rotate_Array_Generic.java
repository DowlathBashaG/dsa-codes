package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
       I/P  :   { 1,2,3,4,5 }
       O/P  :
1. Usecase :
        Before Array ... :
        [1, 2, 3, 4, 5]

        After Rotate Array ... :
        [2, 3, 4, 5, 1]

2. Usecase :  { 1,2,3,4,5 } ,k =7;
        Before Array ... :
                 [1, 2, 3, 4, 5]
        After Rotate Array ... :
                [3, 4, 5, 1, 2]
    Note :
            Observation 1 :   if K 's value is positive : k % len(A)
            Observation 2 :   if K 's value is negative : k + len(A)

 */
public class Rotate_Array_Generic {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println("Before Array ... : ");
        System.out.println(Arrays.toString(a));
        rotateArray(a,3);
        System.out.println("After Rotate Array ... :");
        System.out.println(Arrays.toString(a));

    }

    static void rotateArray(int[] a , int k){
        k = k % a.length;
        if(k<0){
            k = k + a.length;
        }
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }

    private static void reverse(int[] a,int start,int end) {
        while(start < end){
            int tmp = a[start];
            a[start] = a[end];
            a[end] = tmp;
            start++;
            end--;
        }
    }
}

