package io.dowlath.dsa.leetcode.string;

public class Reverse_String_In_Recursion {
    public static void main(String[] args) {
        String s = "Dowlath";
        reverseString(s);
    }
    static void reverseString(String s){
        if(s==null || s.isEmpty()){
            System.out.println(s);
        } else {
            System.out.print(s.charAt(s.length()-1));
            reverseString(s.substring(0,s.length()-1));
        }
    }
}
