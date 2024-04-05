package io.dowlath.dsa.leetcode.string;

public class Palindrome_Number {
    public static void main(String[] args) {
      int n = 123;
      int reverseN = reverseNumber(n);
        System.out.println(reverseN);
        if(n == reverseN)
        {
            System.out.println("It is palindrome");
        } else
        {
            System.out.println("It is not palindrome");
        }
    }

    private static int reverseNumber(int n) {
        int reverse_number = 0;
        while(n>0){
            reverse_number = reverse_number * 10 + n % 10;
            n = n / 10;
        }
        return reverse_number;
    }
}
