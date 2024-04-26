package io.dowlath.dsa.leetcode.array;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] res = generateSpiralMatrix(n);
        print(res);

    }
    public static void print(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[][] generateSpiralMatrix(int n) {
        int[][] output = new int[n][n];
        if(n==0) return output;
        int count = 1;
        int colS = 0;
        int colE = n-1;
        int rowS = 0;
        int rowE = n-1;
        while(colS <= colE && rowS <= rowE){
            for(int i= colS; i <= colE; i++){
                output[rowS][i] = count++;
            }
            rowS++;
            for(int i= rowS; i <= rowE; i++){
                output[i][colE] = count++;
            }
            colE--;
            for(int i= colE; i >= colS; i--){
                output[rowE][i] = count++;
            }
            rowE--;
            for(int i= rowE; i >= rowS; i--){
                output[i][colS] = count++;
            }
            colS++;
        }
        return output;
    }
}
