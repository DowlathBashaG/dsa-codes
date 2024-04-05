package io.dowlath.dsa.leetcode.hackerrank;

/*
        I/P : N = 5
        O/P : 14

        I/P : N = 4
        O/P : 7

 */


import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(utopianTree(n));
    }

    private static int utopianTree(int n) {
        int t = 1;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                t = t + 1;
            }
            else{
                t = t * 2;
            }
        }
        return t;
    }
}
