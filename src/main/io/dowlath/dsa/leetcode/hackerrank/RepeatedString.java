package io.dowlath.dsa.leetcode.hackerrank;

/*
         I/P   :  "ababababab" , n = 10
         O/P   :   5
 */
public class RepeatedString {

    static long repeatedString(String s , long n){
        long countA = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }
        }
        countA = countA * (n/s.length());

        for(int i =0; i<(n%s.length()); i++){
            if(s.charAt(i) == 'a')
            {
                countA++;
            }
        }
        return countA;
    }

    public static void main(String[] args) {
        long n = 10;
        String s = "ababababab";
        System.out.println(repeatedString(s,n));


    }
}
