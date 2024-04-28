package io.dowlath.sorting_hash_map_values;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortingHashMapValues {
	public static void main(String ags[]){
		Map<String,Integer> myHashMap = new HashMap<String,Integer>();
		myHashMap.put("Dowlath", 57);
		myHashMap.put("Basha", 5);
		myHashMap.put("Arsh", 1);
		myHashMap.put("Zunith", 700);
		myHashMap.put("Vetri", 100);
		Set set = myHashMap.entrySet();
		Iterator it = set.iterator();
		System.out.println("Before sorting\n");
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+ " < ------ > "+ me.getValue());
		}
		System.out.println("After sorting\n");
		
		Set<Map.Entry<String,Integer>> set1 = myHashMap.entrySet();
		List<Map.Entry<String,Integer>> list = new ArrayList<>(set1);
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2){
				return  o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry myE : list){
			System.out.println(myE.getKey()+" < -- > "+myE.getValue());
		}
	}

}
