package io.dowlath.dsa.leetcode.array;
/*
     I/P :
            3 Dsic
            A
            B
            C
     O/P :
            A -> C
            A -> B
            C -> B
            A -> C
            B -> A
            B -> C
            A -> C

    Note : count is => 7 steps
 */

public class Towers_Of_Hanoi {
    public static void main(String[] args) {
       towersOfHanoi(3,'A','B','C');
    }

    private static void towersOfHanoi(int n, char src, char aux, char dest) {
        if( n==1){
            System.out.println(src + " -> " + dest);
            return;
        }
        towersOfHanoi(n-1,src,dest,aux);
        towersOfHanoi(1,src,aux,dest);
        towersOfHanoi(n-1,aux,src,dest);
    }
}
