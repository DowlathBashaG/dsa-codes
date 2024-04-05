package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
       I/P   :
               Give array ... :
                    [12, 4, 0, 0, 2, 6, 0, 0, 7, 5, 2]

       O/P   :
               After moved zeros ... :
                    [12, 4, 2, 6, 7, 5, 2, 0, 0, 0, 0]

 */
public class Move_Zeros_Last_Position {
    public static void main(String[] args) {
        int[] a = {12,4,0,0,2,6,0,0,7,5,2};
        System.out.println("Given array ... :");
        System.out.println(Arrays.toString(a));
        moveZeros(a);
        System.out.println("After moved zeros ... : ");
        System.out.println(Arrays.toString(a));
    }

    private static void moveZeros(int[] a) {
        int size = a.length;

        if(size == 0 || size == 1){
            return;
        }

        int nz=0,z=0;

        while(nz<size){
            if(a[nz] != 0){
                int tmp = a[nz];
                a[nz] = a[z];
                a[z] = tmp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
}
