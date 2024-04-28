package io.dowlath.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCaseInsensitive extends HashMap<String,String>{
	
	public String put(String key,String value){
		return super.put(key.toLowerCase(), value);
	}
	public String get(Object key){
		return super.get(key.toString().toLowerCase());
	}
public static void main(String[] args) {
	
	Map<String,String> map =new HashMapCaseInsensitive();
	map.put("Dowlath","basha");
	map.put("arsH","Ladu");
	map.put("naveedA","zamani");
	map.put("Raj","Kumar");
	map.put("magaehs","Boopathi");
	
	System.out.println("The size of map.........: "+map.size());
	
	//System.out.println("Value of the following key (arsH)...: "+map.get("Arsh"));
	System.out.println("Value of the following key (Raj)...: "+map.get("raj"));
	System.out.println("Value of the following key (Dowlath)...: "+map.get("dowlath"));
	System.out.println("Value of the following key (arsH)...: "+map.get("Arsh"));
}
	
 
}
