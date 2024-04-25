package io.dowlath.dsa.leetcode.array;

public class TicTacToe {
    private int[] rows;
    private int[] cols;
    private int diagonal;
    private int antiDiagonal;

    public TicTacToe(int n){
        rows = new int[n];
        cols = new int[n];
    }

    public int move(int row, int col,int player){
        int intPlayer = player == 1 ? 1 : -1;
        rows[row] += intPlayer;
        cols[row] += intPlayer;
        if(row == col) diagonal += intPlayer;
        if(row == rows.length - col - 1) antiDiagonal += intPlayer;
        int size = rows.length;
        if(Math.abs(rows[row]) == size ||
                Math.abs(cols[col]) == size ||
                Math.abs(diagonal) == size ||
                Math.abs(antiDiagonal) == size){
            return player;
        }
        return 0;
    }
}
