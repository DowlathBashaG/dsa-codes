package io.dowlath.dsa.leetcode.array;

/*
      I/P :    N = 15 length of rope
               Using these below sizes will cut.....
      O/P :
               A  = 5 , 5 , 5 => 3 pieces
               B  = 7 , 8 => 2 pieces
               C  = 8 , 7 => 2 pieces

               If all pieces cut successfully , it will return size 0 , else it will return -1 it is not completed
               still few pieces are left.

      Result : 3

 */
public class Rope_Cutting_Problem {
    public static int maxPieces(int n, int a, int b, int c){
        if(n==0){
            return 0;
        } else if(n<0){
            return -1;
        }
        int temp1 = maxPieces(n-a,a,b,c);
        int temp2 = maxPieces(n-b,a,b,c);
        int temp3 = maxPieces(n-b,a,b,c);

        int pieces = Math.max(temp3, Math.max(temp1,temp3));
        if( pieces == -1){
            return -1;
        }
        return pieces + 1;
    }
    public static void main(String[] args) {
        System.out.println(maxPieces(15,5,7,8));
    }
}
