package io.dowlath.dsa.leetcode.array;

/*
     I/P :  {20,42,6,25,30,88}
     O/P :  42
*/

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] a = {20,42,6,25,30,88};
        System.out.println(secondLargest(a));
    }

    private static int secondLargest(int[] a) {
        int max1 = 0, max2 = 0;

        if( a[0] > a[1]){
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }

        for(int i=2;i<a.length;i++){
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2){
                max2  = a[i];
            }
        }
        return max2;
     }
}
