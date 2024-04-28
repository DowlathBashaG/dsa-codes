package io.dowlath.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortingHashMapValues {
	public static void main(String args[]){
		Map<String,Integer> myMap = new HashMap<>();
		myMap.put("Dowlath", 13);
		myMap.put("Basha", 130);
		myMap.put("Arsh", 56);
		myMap.put("Zunith", 1);
		myMap.put("Vetri", 2);
		System.out.println("Before sorting...: ");
		Set set1 = myMap.entrySet();
		Iterator it = set1.iterator();
		while(it.hasNext()){
			Map.Entry me1 = (Map.Entry)it.next();
			System.out.println(me1.getKey() + " < --- > " + me1.getValue());
		}
		System.out.println("\nAfter sorting...: ");
		Set<Map.Entry<String,Integer>> set2 = myMap.entrySet();
		List<Map.Entry<String,Integer>> list = new ArrayList<>(set1);
		Collections.sort(list,new Comparator <Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
				return o1.getValue() - o2.getValue();
			}
			
		});
		for(Map.Entry me2 : list){
			System.out.println(me2.getKey() + " < ---- > "+ me2.getValue());
		}
	}

}
