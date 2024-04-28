package io.dowlath.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapWorking {
	public static void main(String args[]){
		Map hashMap = new HashMap();
		Map weakHashMap = new WeakHashMap();
		String weakKey = new String("WeakKey");
		String hashKey = new String("HashKey");
		hashMap.put(hashKey, "hashValue");
		weakHashMap.put(weakKey, "weakValue");
		System.gc();
		System.out.println("Before... : "+weakHashMap.get("WeakKey")+"<---->"+hashMap.get("HashKey"));
		weakKey = null;
		hashKey = null;
		System.gc();
		System.out.println("After... : "+weakHashMap.get("WeakKey")+"<---->"+hashMap.get("HashKey"));

				
	}
	

}

 
//public class WeakHashMapWorking {
//	public static void main(String[] args) {
//		Map hashMap= new HashMap();
//		
//        Map weakHashMap = new WeakHashMap();
//        
//        String keyHashMap = new String("keyHashMap");
//        String keyWeakHashMap = new String("keyWeakHashMap");
//        
//        hashMap.put(keyHashMap, "Ankita");
//        weakHashMap.put(keyWeakHashMap, "Atul");
//        System.gc();
//        System.out.println("Before: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
//        
//        keyHashMap = null;
//        keyWeakHashMap = null;
//        
//        System.gc();  
//        
//        System.out.println("After: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
//    }
//}
 

