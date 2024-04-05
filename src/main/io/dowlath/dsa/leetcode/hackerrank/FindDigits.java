package io.dowlath.dsa.leetcode.hackerrank;

import java.util.Scanner;

/*
      I/P :  124
      O/P :  3

      I/P :  1012
      O/P :  3

      I/P :  2
      O/P :  1

 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findDigit(n));
    }

    private static int findDigit(int n) {
        int t = n;
        int count = 0;
        int ld = 0;
        while(t>0){
            ld = t % 10;
            if (ld != 0) {
                if(n%ld == 0){
                    count++;
                }
            }
            t = t/10;
        }
        return count;
    }
}
