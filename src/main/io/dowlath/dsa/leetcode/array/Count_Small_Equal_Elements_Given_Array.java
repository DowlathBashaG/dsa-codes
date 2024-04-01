package io.dowlath.dsa.leetcode.array;

/*
    Using Binary search will achieve this...

     I/P :
           {2,6,12,18,21,26,33,42}

           Key = 26

     O/P :
           6

           6 elements are lesser than 26 and equal 26.
 */

public class Count_Small_Equal_Elements_Given_Array {
    public static void main(String[] args) {
          int[]  a = {2,6,12,18,21,26,33,42};
          int key = 26;
        System.out.println(countSmall_And_Equal_Elements(a,key));
    }

    private static int countSmall_And_Equal_Elements(int[] a, int key) {
        int l = 0,h=a.length-1,mid =0;
        while(l<=h){
            mid = (l+h) / 2;
            if(key == a[mid]){
                break;
            } else if (key < a[mid]){
                h = mid -1 ;
            } else if( key > a[mid]){
                l = mid +1;
            }
        }
        return mid+1;

    }
}

