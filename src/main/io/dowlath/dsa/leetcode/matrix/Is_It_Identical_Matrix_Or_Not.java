package io.dowlath.dsa.leetcode.matrix;

public class Is_It_Identical_Matrix_Or_Not {
    public static void main(String[] args) {
        int[][] a = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println("Is it identical : "+ identicalMatrix(a));
    }

    private static boolean identicalMatrix(int[][] a) {
        for(int i=0;i<a.length;++i){
            for(int j=0;j<a.length;++j){
                if(i == j && a[i][j] != 1){
                    return false;
                } else if(i != j && a[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

}
