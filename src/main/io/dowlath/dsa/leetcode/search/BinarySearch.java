package io.dowlath.dsa.leetcode.search;

/*
   Note :  Binary search can't use unsorted array.
           Always using sorting ascending or descending order
   I/P  :  {3,5,6,8,12,15,16,19,21} & key is 13 . This 13 is not present in the array.

   O/P  :   -1
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {3,5,6,8,12,15,16,19,21};
        int key = 13;
        System.out.println(binarySearch(a,key));
    }

    private static int binarySearch(int[] a, int key) {
        int l = 0, h = a.length-1, mid;
        while( l<=h){
            mid = (l+h) / 2;
            if( key == a[mid]){
                return mid;
            }
            else if(key < a[mid]){
                h = mid -1;
            } else if (key > a[mid]){
                l = mid +1;
            }
        }
        return -1;
    }
}
