package io.dowlath.dsa.leetcode.string;

public class LongestPalindrome_Using_For_Loop {
    public static void main(String[] args) {
        String s = "DowlathBashaaaabbbbFromIndia";
        longestPalindrome(s);
    }

    private static void longestPalindrome(String s) {
        int n = s.length();
        int max = 1;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean flag = true;
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (s.charAt(i + k) != s.charAt(j - k))
                        flag = false;
                    if (flag && (j - i + 1) > max) {
                        start = i;
                        max = j - i + 1;
                    }
                }
            }
            System.out.println(s.substring(start, start + max));
        }
}
