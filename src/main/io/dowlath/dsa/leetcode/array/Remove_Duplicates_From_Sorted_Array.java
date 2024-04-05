package io.dowlath.dsa.leetcode.array;

/*

 */
public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] ar = {2,2,3,3,4,6,6};
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+ " ");
        }
        int rd = removeDuplicates(ar);
        System.out.println();

        for(int i=0;i<rd;i++){
            System.out.print(ar[i] + " ");
        }
    }

    private static int removeDuplicates(int[] ar) {
        int rd = 0;
        for(int i=1;i<ar.length;i++){
            if(ar[rd] != ar[i]){
                rd++;
                ar[rd] = ar[i];
            }
        }
        return rd+1;
    }
}
