package io.dowlath.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyStudentIDSorting {
	public static void main(String args[]){
		Student st1 = new Student(1,"Dowlath","Basha");
		Student st2 = new Student(4,"Arsh","Dowlath");
		Student st3 = new Student(3,"Bala","Murugan");
		Student st4 = new Student(2,"Sri","Kumar");
		Student st5 = new Student(7,"Sathis","Varma");
		List  ll = new ArrayList();
		ll.add(st1);
		ll.add(st2);
		ll.add(st3);
		ll.add(st4);
		ll.add(st5);
		System.out.println("Before sorting.....");
		System.out.println(ll);
		System.out.println("#####################################################################");
		System.out.println("Id sorting.....");
		Collections.sort(ll,new StudentIdComparator());
		System.out.println(ll);
		System.out.println("#####################################################################");
		System.out.println("First name sorting.....");
		Collections.sort(ll,new StudentFirstNameComparator());
		System.out.println(ll);
		System.out.println("#####################################################################");
		System.out.println("Last name sorting.....");
		Collections.sort(ll,new StudentLastNameComparator());
		System.out.println(ll);
		
	}

}

class StudentIdComparator implements Comparator<Student> {
	public int compare(Student st1,Student st2){
		return st1.getId() - st2.getId();		
	}
}

class StudentFirstNameComparator implements Comparator<Student>{
	public int compare(Student st1,Student st2){
		return st1.getfName().compareTo(st2.getfName());
	}
}

class StudentLastNameComparator implements Comparator<Student>{
	public int compare(Student st1,Student st2){
		return st1.getlName().compareTo(st2.getlName());
	}
}