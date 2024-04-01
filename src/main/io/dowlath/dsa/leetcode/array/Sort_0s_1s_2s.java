package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

public class Sort_0s_1s_2s {
    public static void main(String[] args) {
        int[] a = { 1,2,0,0,0,2,2,1,1,1,0,2};
        sort0s1s2s(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort0s1s2s(int[] a) {
        int i=0,j=0,k=a.length-1;
        while(i<=k){
            if(a[i] == 0){
                swap(a,i,j);
                i++;
                j++;
            } else if(a[i] == 1){
                i++;
            } else if (a[i] == 2){
                swap(a,i,k);
                k--;
            }
        }
    }

    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
