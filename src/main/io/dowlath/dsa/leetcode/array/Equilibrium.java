package io.dowlath.dsa.leetcode.array;

/*
      I/P  :

             { 3, 1, 2, 4, 3 }

               3+1+2 = 6
               4+3 = 7
               7-6 = 1
      O/P  :
             1
 */
public class Equilibrium {
    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        int equilibriumValue = equilibrium(A);
        System.out.println("The Equilibrium value ....  : " + equilibriumValue);
    }

    private static int equilibrium(int[] A) {
        int leftSum  = A[0];
        int rightSum = 0;
        for(int x : A){
            rightSum = rightSum + x;
        }
        rightSum = rightSum - leftSum;
        int diff = Math.abs(leftSum - rightSum);
        for(int i = 1; i<A.length;i++){
            leftSum = leftSum+ A[i];
            rightSum = rightSum - A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if(diff > currentDiff) diff = currentDiff;
        }
        return diff;
    }

}
