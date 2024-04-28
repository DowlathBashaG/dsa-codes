package io.dowlath.design_pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private List<String> empList;
	public Employee(){
		empList = new ArrayList<>();
	}
	public Employee(List<String> employeeList){
		this.empList = employeeList;
	}
	public void loadData(){
		empList.add("Dowlath");
		empList.add("Basha");
		empList.add("Arsh");
		empList.add("Naveeda");
	}
	public List<String> getEmpList(){
		return empList;
	}
	public Object clone() throws CloneNotSupportedException{
		List<String> tmpList = new ArrayList<>();
		for(String s : empList){
			tmpList.add(s);
		}
		return new Employee(tmpList);
	}

}
