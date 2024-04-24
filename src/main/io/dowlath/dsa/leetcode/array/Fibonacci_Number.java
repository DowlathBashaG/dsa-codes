package io.dowlath.dsa.leetcode.array;

public class Fibonacci_Number {
    public static void main(String[] args) {
        int n = 2; // 0  1  1  2  3  5  8
        System.out.println("Fibonnacci Series ... : "+ fib(n));
    }

    private static int fib(int n) {
        if(n == 0) return 0;
        int first = 0;
        int second = 1;
        while(n > 1){
            int tmp = second;
            second = second + first;
            first = tmp;
            n--;
        }
        return second;
    }
}
