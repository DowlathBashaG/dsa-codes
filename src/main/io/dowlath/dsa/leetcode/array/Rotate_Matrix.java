package io.dowlath.dsa.leetcode.array;

/*
        Given Matrix ... :
        1 2 3
        4 5 6
        7 8 9
        Rotated Matrix ... :
        7 4 1
        8 5 2
        9 6 3
 */
public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Given Matrix ... :");
        printMatrix(a);
        rotateMatrix(a);
        System.out.println("Rotated Matrix ... :");
        printMatrix(a);
    }

    private static void rotateMatrix(int[][] a) {
       int n = a.length;
       //first , left , right flip
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int tmp = a[i][j];
                a[i][j] = a[i][n-1-j];
                a[i][n-1-j] = tmp;
            }
        }
        //second , anti diagonal
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                int tmp = a[i][j];
                a[i][j]=a[n-1-j][n-1-i];
                a[n-1-j][n-1-i] = tmp;
            }
        }
    }

    private static void printMatrix(int[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
