package io.dowlath.dsa.leetcode.hackerrank;
/*
       I/P   : n = 15 , c = 3 , m = 2

       O/P   : 9
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        int n = 15;
        int c = 3;
        int m = 2;
        System.out.println(chocolateFeast(n,c,m));
    }
    static int chocolateFeast(int n, int c, int m){
        int choco = n/c;
        int wrap = choco;
        int newChoco = 0;

        while(wrap >= m){
            newChoco = wrap/m;
            choco = choco + newChoco;
            wrap = (wrap % m) + newChoco;
        }
        return choco;
    }
}
