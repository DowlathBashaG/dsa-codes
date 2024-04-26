package io.dowlath.dsa.leetcode.string;

public class Reverse_Sentence {
    public static void main(String[] args) {
        String s="i am a java developer from bangalore";
        // Expected : bangalore developer from java am a i”
        // Actual Printing : bangalore from developer java a am i
        reverseString(s);
    }

    private static void reverseString(String s) {
        String[] a = s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
    }
}
