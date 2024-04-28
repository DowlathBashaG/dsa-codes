package io.dowlath.dsa.leetcode.oops;

import java.io.IOException;

/*

    CE : Bcoz of Exception is super class for IO , but here IOE ..and Ex declare it is not override
 */

class A{
    public void method() throws IOException {

    }
}
class B extends A{
    public void method() { //throws Exception{

    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        B b = new B();
        try{
            b.method();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
