package io.dowlath.dsa.leetcode.array;
/*
   O/P : The sum of a and b is: 222232244629420445529739893461909967206666939096499764990979601
 */
public class Add_Two_Big_Integer_WithOut_Using_BigInteger {
    public static void main(String[] args) {
        // Define the two numbers as strings
        String a = "222232244629420445529739893461909967206666939096499764990979600";
        String b = "1";

        // Add the two numbers
        String sum = addStrings(a, b);

        // Print the result
        System.out.println("The sum of a and b is: " + sum);
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }

        return result.toString();
    }
}
