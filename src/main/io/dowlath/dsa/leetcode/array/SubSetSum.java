package io.dowlath.dsa.leetcode.array;
/*
      I/P :
             A = {20,10,15,5}
             Sum = 25
      O/P :

             SubSet
             1. (20,5)
             2. (10,15)

             Totally 2

 */
public class SubSetSum {
    public static void main(String[] args) {
        int[] a = {20,10,15,5};
        System.out.println(countSubSets(a,25,0));
    }

    private static int countSubSets(int[] a, int sum, int i) {
        // 1 means success , 0 means failed
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(i == a.length){
            return 0;
        }
        return countSubSets(a,sum-a[i],i+1) + countSubSets(a,sum,i+1);
    }
}
