package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
        I/P :  red , white , blue ....sort.
        Given array unsorted colors...
        [2, 0, 2, 1, 1, 0]
        After sorted colors...
        [0, 0, 1, 1, 2, 2]
 */

public class Sort_Colors {
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};  // {0,0,1,1,2,2}
        System.out.println("Given array unsorted colors...");
        System.out.println(Arrays.toString(a));
        sortColors(a);
        System.out.println("After sorted colors...");
        System.out.println(Arrays.toString(a));
    }

    private static void sortColors(int[] a) {
        if(a.length == 0 || a.length == 1) return;
        int start = 0;
        int end = a.length-1;
        int index = 0;
        while(start < end && index <= end){
            if(a[index] == 2){
                int tmp = a[index];
                a[index] = a[end];
                a[end] = tmp;
                end--;
            } else if (a[index] == 0){
                int tmp = a[index];
                a[index] = a[start];
                a[start] = tmp;
                start++;
                index++;
            } else {
                index++;
            }
        }
    }

}
