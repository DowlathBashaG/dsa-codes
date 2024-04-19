package io.dowlath.dsa.leetcode.tricky_questions;

/*
         I/P :
                50

         O/P :
                50

         I/P :
                5

         O/P :
                NullPointerException
                Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()"
                at io.dowlath.dsa.leetcode.tricky_questions.Passing_Int_Return_Type_Null.foo(Passing_Int_Return_Type_Null.java:19)
                at io.dowlath.dsa.leetcode.tricky_questions.Passing_Int_Return_Type_Null.main(Passing_Int_Return_Type_Null.java:23)

 */
public class Passing_Int_Return_Type_Null {
    static int foo(int i){
        return (i<10 ? null : i);
    }

    public static void main(String[] args) {
        int x = Passing_Int_Return_Type_Null.foo(5);
        System.out.println(x);
    }
}
