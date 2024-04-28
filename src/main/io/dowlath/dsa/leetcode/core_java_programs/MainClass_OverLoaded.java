package io.dowlath.dsa.leetcode.core_java_programs;

/*
        O/P : TWO
 */
class A{

}
class B extends A{

}
class C extends B{

}
public class MainClass_OverLoaded {
    static void overLoadedMethod(A a){
        System.out.println("ONE");
    }
    static void overLoadedMethod(B b){
        System.out.println("TWO");
    }
    static void overLoadedMethod(Object o){
        System.out.println("THREE");
    }
    public static void main(String[] args) {
        C c = new C();
        overLoadedMethod(c);
    }
}
