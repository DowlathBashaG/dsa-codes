package io.dowlath.dsa.leetcode.string;

public class Reverse_String {
    public static void main(String[] args) {
        String s = "Dowlath";
        System.out.println("Given String .... : "+ s);
        char[] a = s.toCharArray();
        String reverseString = reverseString(a);
        System.out.println("Reverse......: "+ reverseString);
    }

    private static String reverseString(char[] a) {
        int left = 0;
        int right = a.length -1;
        while(left < right){
            char tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(a);
    }
}
