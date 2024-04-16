package io.dowlath.dsa.leetcode.hackerrank;


import java.util.ArrayList;
import java.util.List;

/*
       I/P    :    [5,6,7]   &  [3,6,10]

       O/P    :

                 [1, 1]
 */
public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        alice.add(5);
        alice.add(6);
        alice.add(7);
        List<Integer> bob = new ArrayList<>();
        bob.add(3);
        bob.add(6);
        bob.add(10);
        List<Integer> result = compareTriplets(alice,bob);
        System.out.println(result);


    }
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int alice = 0;
        int bob = 0;
        for(int i=0;i<3;i++)
        {
            if(a.get(i) > b.get(i)){
                alice++;
            }else if(a.get(i) < b.get(i))
            {
                bob++;
            }
        }
        ArrayList res = new ArrayList();
        res.add(alice);
        res.add(bob);
        return res;
    }
}
