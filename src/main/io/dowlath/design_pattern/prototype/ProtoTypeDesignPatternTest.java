package io.dowlath.design_pattern.prototype;

import java.util.List;

/*
 *    ProtoType Design Pattern :
 *    				Copy the original object from new object and modify the object according to our needs. 
 */

public class ProtoTypeDesignPatternTest {
     public static void main(String args[]) throws CloneNotSupportedException{
    	 Employee emp = new Employee();
    	 emp.loadData();
    	 
    	 Employee emp1 = (Employee)emp.clone();
    	 Employee emp2 = (Employee)emp.clone();
    	 
    	 List<String> list1 = emp1.getEmpList();
    	 List<String> list2 = emp2.getEmpList();
    	 list1.add("Joe");
    	 list2.remove("Dowlath");
    	 
    	 
    	 System.out.println(emp.getEmpList());
    	 System.out.println(list1);
    	 System.out.println(list2);
     }
}
