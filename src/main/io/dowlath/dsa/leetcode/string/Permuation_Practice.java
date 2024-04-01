package io.dowlath.dsa.leetcode.string;
import java.util.Scanner;
/*
      I/P : ABC
      O/O :
            ABC
            ACB
            BAC
            BCA
            CBA
            CAB
 */



public class Permuation_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        permuation(s.toCharArray(),0);
    }

    private static void permuation(char[] a, int fi) {

        // base condition
        if(fi == a.length-1){
            System.out.println(a);
            return;
        }

        for(int i = fi ; i<a.length;i++){
            swap(a,i,fi);
            permuation(a,fi+1);
            swap(a,i,fi);
        }
    }

    private static void swap(char[] a, int i, int fi) {
        char tmp = a[i];
        a[i] = a[fi];
        a[fi] = tmp;
    }

}
