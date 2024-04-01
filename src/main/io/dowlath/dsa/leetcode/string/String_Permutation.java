package io.dowlath.dsa.leetcode.string;

import java.util.Scanner;
/*
  fi -> fixed index

     I/P :  ABC
     O/P :
            ABC
            ACB
            BAC
            BCA
            CBA
            CAB

 */
public class String_Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        permutations(s.toCharArray(),0);
    }
    // fi => fixedindex
    static void permutations(char[] ar, int fi){

        if(fi == ar.length-1){
            System.out.println(ar);
        }

        for(int i=fi;i<ar.length;i++){
            swap(ar,i,fi);
            permutations(ar,fi+1);
            swap(ar,i,fi);
        }
    }
    static void swap(char[] ar, int i, int fi){
        char tmp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = tmp;
    }
}
