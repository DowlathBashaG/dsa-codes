package io.dowlath.dsa.leetcode.array;

/*
       I/P  :
             A [ ] = { 4,3,6,2,6,4,2,3,4,3,3 }

       O/P  :
              4

       Using XOR =>

           x ^ 0 = x
           x ^ x = 0

       Even Occuring :  x ^ x = 0
                        x  ^ x ^ x ^ x ^ x =>  (x  ^ x) ^ (x ^ x)  => 0 ^ 0 => 0.
       Odd Occuring  :  (x ^ x ^ x) = (x ^ (x ^ x)) = ( x ^ 0 ) = x

 */
public class Find_Odd_Occuring_Element_Single_Traversal {
    public static void main(String[] args) {
     int[] arr = {4,3,6,2,6,4,2,3,4,3,3};
        System.out.println("The Odd Occuring Element is .... : "+ findOddOccuring(arr));
    }

    private static int findOddOccuring(int[] arr) {
        int xor = 0;
        for( int i : arr){
            xor = xor ^ i;
        }
        return xor;
    }


}
