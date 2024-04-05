package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
       I/P :  [7, 3, 5, 9, 2]
       O/P :  [2, 3, 5, 7, 9]

       Given Array (Before Bubble Sort)
       [7, 3, 5, 9, 2]
       After Sorting Bubble.....
       [2, 3, 5, 7, 9]
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7,3,5,9,2};
        System.out.println("Given Array (Before Bubble Sort)");
        System.out.println(Arrays.toString(a));
        System.out.println("After Sorting Bubble.....");
        bubblesort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubblesort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
}
