package io.dowlath.dsa.leetcode.string;

/*
      O/P :  Is it rotated string ... : true
 */
public class Rotate_String {
    public static void main(String[] args) {
        String a = "abcde";  // abcde  return false.
        String b = "cdeab"; // abced
        System.out.println("Is it rotated string ... : "+ rotateString(a,b));
    }

    private static boolean rotateString(String a, String b) {
        if(a.length() != b.length()) return false;
        return (a+a).contains(b);
    }
}
