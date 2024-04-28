package io.dowlath.design_pattern.singleton;
/*
 *  Singleton Design Pattern :
 *  							JVM will create only one instance.
 */

public class Singleton {
   private static Singleton instance = new Singleton();
   private Singleton(){
	   
   }
   public static Singleton getInstance(){
	   return instance;
   }
   public void display(){
	   System.out.println("Display : Singleton ");
   }
   public static void main(String args[]){
	   Singleton singleton1= Singleton.getInstance();
	   Singleton singleton2= Singleton.getInstance();
	   if(singleton1.hashCode() == singleton2.hashCode()){
		   System.out.println("Its singleton");
	   }
	   else {
		   System.out.println("Its not singleton");
	   }
	   singleton1.display();
   }
}
