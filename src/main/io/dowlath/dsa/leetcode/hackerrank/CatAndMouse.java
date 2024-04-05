package io.dowlath.dsa.leetcode.hackerrank;
/*    I/P : 1 2 3
      O/P : Cat B

      I/P : 1 3 2
      O/P : Mouse C
 */
public class CatAndMouse {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 4;
        System.out.println(catAndMouse(x,y ,z));
    }

    private static String catAndMouse(int x, int y, int z){
        int d1 = 0;
        int d2 = 0;
        if(x<=z)
        {
            d1 = z-x;
        } else {
            d1 = x-z;
        }

        if(y<=z)
        {
            d2 = z-y;
        } else {
            d2 = y-z;
        }

        if(d1 == d2){
            return "Mouse C";
        }
        else if(d1 < d2)
        {
            return "Cat A";
        }
        else{
            return "Cat B";
        }
    }
}
