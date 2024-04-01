package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;
/*
   I/P :
   int[] a = { 2,5,6,7};
   int[] b = { 3,4,9};

   O/P :

   [2, 3, 4, 5, 6, 7, 9]

 */

public class Merge_Sorted_Array {
    public static void main(String[] args) {

        int[] a = { 2,5,6,7};
        int[] b = { 3,4,9};
        int[] result = mergeSortedArray(a,b,a.length,b.length);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSortedArray(int[] a, int[] b, int n, int m) {
        int[] result = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){

            if(a[i] < b[j]){
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k] = a[i];
            i++;k++;
        }

        while(j<m){
            result[k] = b[j];
            j++;k++;
        }
        return result;
    }

}
