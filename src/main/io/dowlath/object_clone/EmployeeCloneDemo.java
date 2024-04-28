package io.dowlath.object_clone;

public class EmployeeCloneDemo {
	public static void main(String args[]) throws CloneNotSupportedException{
		EmployeeClone ec = new EmployeeClone(100,"Dowlath");
		EmployeeClone ec1 = (EmployeeClone)ec.clone();
		//EmployeeClone ec1 = (EmployeeClone)ec;
		System.out.println(ec1.geteId()+"-----------------"+ec1.geteName());	
		System.out.println(ec.hashCode());
		System.out.println(ec1.hashCode());
	}

}
