package io.dowlath.dsa.leetcode.hackerrank;

public class LoveLetterMystery {
    public static void main(String[] args) {
        System.out.println(loveLetterMystrey("abcd"));
    }

    private static int loveLetterMystrey(String s) {
        int count = 0;
        int c1 = ' ';
        int c2 = ' ';
        int t = 0;
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            c1 = s.charAt(i);
            c2 = s.charAt(j);
            if(c1 < c2){
                t = c1 - c2;
            } else{
                t = c2 - c1;
            }
            count = count + t;
            i++;
            j--;
        }
        return count;
    }
}
