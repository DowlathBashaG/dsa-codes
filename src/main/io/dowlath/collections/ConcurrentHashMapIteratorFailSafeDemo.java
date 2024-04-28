package io.dowlath.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIteratorFailSafeDemo {
   public static void main(String args[]){
	   ConcurrentHashMap<String,String> chm = new ConcurrentHashMap<String,String>();
	   chm.put("Dell", "Laptop - 1");
	   chm.put("Sony", "Laptop - 2");
	   chm.put("Toshipa", "Laptop - 3");
	   chm.put("Lenova", "Laptop - 4");
	   chm.put("Samsung", "Laptop - 5");
	   Iterator<String>  iterator = chm.keySet().iterator();
	   while(iterator.hasNext()){
		   System.out.println(iterator.next());
		   chm.put("Apple","IMAC");
		   //System.out.println(iterator.next());
	   }
   }
}
