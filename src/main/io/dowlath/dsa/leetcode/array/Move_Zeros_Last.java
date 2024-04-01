package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
  I/P:

     { 1, 9, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0}

  O/P:

      [1, 9, 2, 8, 3, 6, 4, 5, 7, 0, 0, 0, 0, 0]

 */
public class Move_Zeros_Last {
    public static void main(String[] args) {
        int a[] = { 1, 9, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0}; //{0,1,0,3,12};
               //   0  1  2  3  4  5  6  7  8  9  10  11  12 13
        moveZerosLast(a);
    }

    private static void moveZerosLast(int[] a) {
      if(a.length == 1) return;
      int left = 0;
      for( int right = 0; right < a.length;right++){
          if(a[right] != 0){
              a[left] = a[right];
              left++;
          }
      }
      for(int i = left; i<a.length;i++){
          a[i] = 0;
      }

        System.out.println(Arrays.toString(a));
    }

}
