package io.dowlath.dsa.leetcode.array;

/*
     I/P :
           array = [ 5,10,20,15 ]
     O/P :
           20
 */
public class Find_A_Peak_Element {
    public static void main(String[] args) {
        int[] a = {5, 10, 20, 15};
        int n = a.length;
        System.out.println("Index of a peak point is .... : " + findPeakElement(a, n));
    }

    private static int findPeakElement(int[] a, int n) {
        if (n == 1)
            return 0;

        if (a[0] >= a[1])
            return 0;

        if (a[n - 1] >= a[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1])
                return i;
        }
        return 0;
    }

   /* private static int findPeak(int[] a, int n) {
        int index = findPeakElementIndex(a, n);
        int i = 0;
        while (i < n) {
            if (a[i] == index) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return i;
    }*/
}
