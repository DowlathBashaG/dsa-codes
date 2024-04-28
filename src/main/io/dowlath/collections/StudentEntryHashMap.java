package io.dowlath.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentEntryHashMap {
	public static void main(String args[]){
		Map<StudentEntry,Integer> myMap = new HashMap<>();
		StudentEntry se1 = new StudentEntry(1,"A");
		StudentEntry se2 = new StudentEntry(1,"A");
		StudentEntry se3 = new StudentEntry(1,"A");
		StudentEntry se4 = new StudentEntry(2,"B");
		StudentEntry se5 = new StudentEntry(2,"B");
		StudentEntry se6 = new StudentEntry(2,"B");
		
		myMap.put(se1, 10001);
		myMap.put(se2, 10002);
		myMap.put(se3, 10003);
		myMap.put(se4, 10004);
		myMap.put(se5, 10005);
		myMap.put(se6, 10006);
		
		Set<Map.Entry<StudentEntry,Integer>> studentSet = myMap.entrySet();
		for(Map.Entry entry : studentSet){
			System.out.println(entry.getKey()+"........"+entry.getValue());
		}

	}
}
