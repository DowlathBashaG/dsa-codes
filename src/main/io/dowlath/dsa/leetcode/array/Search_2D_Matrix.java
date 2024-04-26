package io.dowlath.dsa.leetcode.array;
/*
      O/P :  Is it available in this matrix ... : false
 */
public class Search_2D_Matrix {
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 99;
        System.out.println("Is it available in this matrix ... : "+searchMatrix(a,target));
    }

    private static boolean searchMatrix(int[][] a, int target) {
        if(a.length == 0) return false;
        int row = a.length;
        int col = a[0].length;
        int start = 0;
        int end = row * col - 1;
        while(start <= end){
            int mid = start + (end-start) /2;
            int current = a[mid / col][mid % col];
            if(current == target){
                return true;
            } else if(target > current){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
