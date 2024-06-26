package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] a = {1,3,2,3,4,5,5,6};
        int[] b = {3,3,5};
        int n = a.length;
        int m = b.length;

        //sort
        Arrays.sort(a);
        Arrays.sort(b);

        intersection(a,b,n,m);
    }

    private static void intersection(int[] a, int[] b, int n, int m) {
        int i = 0 , j = 0;
        while(i < n && j < m ){
            if(a[i] > b[j]){
                j++;
            }
            else if(b[j] > a[i]){
                i++;
            } else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
