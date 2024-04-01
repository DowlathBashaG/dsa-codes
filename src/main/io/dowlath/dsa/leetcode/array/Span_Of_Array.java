package io.dowlath.dsa.leetcode.array;

/*
       I/P :  {20,42,88,10,99,6}
              Span of Array means max - min  = >  99 - 6 => Result = 93.
       O/P :  93
 */

public class Span_Of_Array {
    public static void main(String[] args) {
        int[] a = {20,42,88,10,99,6};
        System.out.println(spanOfArray(a));
    }

    private static int spanOfArray(int[] a) {
        int min = a[0], max = a[0];
        for(int i=0;i<a.length;i++){
            if(max < a[i]){
                max = a[i];
            }
            if(min > a[i]){
               min = a[i];
            }
        }
        return max-min;
    }
}
