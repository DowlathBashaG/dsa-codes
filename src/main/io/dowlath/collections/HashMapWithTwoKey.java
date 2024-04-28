package io.dowlath.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapWithTwoKey {
	public static void main(String args[]){
		Map<MapKey,List<Object>> map = new HashMap<>();
		
		
		
		MapKey mk1 = new MapKey();
		mk1.setKey1("A");
		mk1.setKey2("B");
		
		List<Object> valueList1 = new ArrayList<>();
		valueList1.add("First");
		map.put(mk1, valueList1);
		
				
		MapKey mk2 = new MapKey();
		mk2.setKey1("");
		mk2.setKey2("");
		List<Object> valueList2 = new ArrayList<>();
		valueList2.add("Second");
		
		map.put(mk2, valueList2);
		
		
		
//		MapKey mk3 = new MapKey();
//		mk3.setKey1("");
//		mk3.setKey2("");
//		List<Object> valueList3 = new ArrayList<>();
//		valueList3.add("Third");
//		
//		map.put(mk3, valueList3);

		System.out.println("Size of map....: "+ map.size());
		
		for(Map.Entry<MapKey, List<Object>> list : map.entrySet()){
			System.out.println("Key...:"+ "<" + list.getKey().getKey1()+","+list.getKey().getKey2()+">");
			System.out.println("Value...:" + list.getValue());
		}
	}

}
