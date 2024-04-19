package io.dowlath.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Arrays_Merge {
    public static void main(String[] args) {
        String[] a = {"A","E","I"};
        String[] b = {"O","U"};
        method_1(a,b);

        int[] k = {1,2,3,4};
        int[] l = {4,16,1,2,3,22};
        method_2(k,l);

    }

    private static void method_1(String[] a, String[] b) {
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println("Method_1 ... : "+Arrays.toString(c));
    }

    private static void method_2(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int count = 0;

        for(int i=0;i<a.length;i++) {
        c[i] = a[i];
        count++;
        }

        for(int j=0;j<b.length;j++){
            c[count++] = b[j];
        }
        System.out.print("Method_2 ... : ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }
    }

}
