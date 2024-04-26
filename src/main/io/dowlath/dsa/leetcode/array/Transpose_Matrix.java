package io.dowlath.dsa.leetcode.array;

/*
        Given Matrix ... :
        1  2  3
        4  5  6
        7  8  9
        Transpose Matrix ... :
        1  4  7
        2  5  8
        3  6  9

 */
public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println("Given Matrix ... :");
        printMatrix(a);
        int[][] transpose = transposeMatrix(a);
        System.out.println("Transpose Matrix ... :");
        printMatrix(transpose);
    }

    private static int[][] transposeMatrix(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[][] output = new int[col][row];
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a[0].length; j++) {
                output[j][i] = a[i][j];
            }
        }
        return output;
    }
    private static void printMatrix(int[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j] +"  ");
            }
            System.out.println();
        }
    }
}
