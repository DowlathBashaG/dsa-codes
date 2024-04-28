package io.dowlath.design_pattern.factory;

/*
 *	  	Factory Design Pattern :
 *
 *							Super class can have multiple sub classes,based on input super class will return any one of subclass. 
 * 
 */
public class FactoryDesignPatternTest {
           public static void main(String args[]){
        	   FactoryMethod fm = new FactoryMethod();
        	   Pet pet = fm.getPetType("Meow");
        	   System.out.println("Pet type ... :" + pet.getSound());
           }
}
