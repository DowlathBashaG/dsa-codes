package io.dowlath.equals_hashcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryValidate {
   public static void main(String args[]){
	   Country c1 = new Country();
	   c1.setCountryName("India");
	   //c1.setPopulation(100);
	   Country c2 = new Country();
	   c2.setCountryName("India");
	   //c2.setPopulation(200);
	   System.out.println("c1....hashcode :"+c1.hashCode());
	   System.out.println("c2....hashcode :"+c2.hashCode());
	   System.out.println("Both(c1&c2) ==...:"+(c1==c2));
	   System.out.println("Both(c1&c2) equal...:"+(c1.equals(c2)));
	   
	   
       Map map = new HashMap();
       map.put(c1,1000);
       map.put(c2,2000);
       Set set = map.entrySet();
       Iterator it = set.iterator();
       while(it.hasNext()){
    	   Map.Entry me = (Map.Entry)it.next();
    	   System.out.println(me.getKey()+"<->"+me.getValue());
       }
   }
   
  
}
