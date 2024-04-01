package io.dowlath.dsa.leetcode.string;

public class Number_Palindrome {
    public static void main(String[] args) {
        int n = 121;
        boolean palindrome = palindrome(n);
        System.out.println("Number Palindrome ... : "+ palindrome);
    }

    private static boolean palindrome(int n) {
        if ( n < 0) return false;
        if( n != 0 &&  n / 10 == 0) return false;
        int reverse = 0;
        while( n > reverse){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return ( (n == reverse) || (n == reverse /10) );
    }
}
