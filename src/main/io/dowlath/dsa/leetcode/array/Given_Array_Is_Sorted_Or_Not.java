package io.dowlath.dsa.leetcode.array;

/*
      I/P :  {2,4,6,8,10,12,14}
      O/P :  true
 */
public class Given_Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10,12,14};
        System.out.println(givenArrayIsSortedOrNot(a));
    }

    private static boolean givenArrayIsSortedOrNot(int[] a) {
        for(int i=1;i<a.length;i++){
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
}
