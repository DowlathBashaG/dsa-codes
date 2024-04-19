package io.dowlath.dsa.leetcode.tricky_questions;

import java.io.IOException;

/*
     Exception hierarhy :

     Low to High
     IOException
     IllegalArgumentException
     ...
     ...
     ..
     Exception

 */
public class Exception_Hierarchy {
    public static void main(String[] args) {
        try{
            throw new Exception("Dowlath");
        } catch(IOException e){
            System.out.println(e.getMessage());  // if i changed the order it wont work,will get compile time error. like instead of IOException , Exception and IOException
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally");
        }
    }
}
