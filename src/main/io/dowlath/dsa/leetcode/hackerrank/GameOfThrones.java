package io.dowlath.dsa.leetcode.hackerrank;

import java.util.Arrays;
/*
     I/P :

           aaabbbb

     O/P :
           YES
 */
public class GameOfThrones{
    static String gameOfThrones(String s)
    {
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        int i = 0;
        int errorCount = 0;
        while(i<ar.length){
            if(ar[i] == ar[i+1])
            {
                i = i + 2;
            }
            else{
                i++;
                errorCount++;
            }
        }
        if(errorCount <= 1){
            return "YES";
        } else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(gameOfThrones("aadmm"));
    }
}
