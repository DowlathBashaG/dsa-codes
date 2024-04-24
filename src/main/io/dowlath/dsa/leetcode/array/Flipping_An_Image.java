package io.dowlath.dsa.leetcode.array;

public class Flipping_An_Image {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(a);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
        }

    }

    private static int[][] flipAndInvertImage(int[][] a) {
        for(int i=0;i<a.length;i++){
            int start =0;
            int end = a[i].length-1;
            while(start < end){
                if(a[i][start] == a[i][end]){
                    a[i][start] = 1 - a[i][start];
                    a[i][end] = a[i][start];
                }
                start++;
                end--;
            }
        }
        return a;
    }
}
