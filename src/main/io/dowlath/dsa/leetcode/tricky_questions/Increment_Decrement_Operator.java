package io.dowlath.dsa.leetcode.tricky_questions;
/*
        O/P :
                A1 static , i= 2
                Increment_Decrement_Operator static , i= 0
                A1 block, i= 2
                Increment_Decrement_Operator block, i= 6
                6
 */
class A1{
    static int i = 100;
    static{
        i = i-- - --i;
        System.out.println("A1 static , i= "+ i);
    }
    {
        i = i++ + ++i;
        System.out.println("A1 block, i= "+ i);
    }
}
public class Increment_Decrement_Operator extends A1{
    static{
        i = --i - i--;
        System.out.println("Increment_Decrement_Operator static , i= "+ i);
    }
    {
        i = ++i + i++;
        System.out.println("Increment_Decrement_Operator block, i= "+ i);
    }

    public static void main(String[] args) {
        Increment_Decrement_Operator b = new Increment_Decrement_Operator();
        System.out.println(b.i);
    }
}
