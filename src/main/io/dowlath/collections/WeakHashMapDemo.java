package io.dowlath.collections;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMapDemo {
	 private static Map map;
     public static void main(String args[]){
    	 map = new HashMap();
    	 //map = new WeakHashMap();
    	 City c = new City("Chennai","India");    	 
    	 map.put(c, c.getCountry());
    	 c = null;
    	 System.gc();
    	 System.out.println("Map...: "+c.toString());
    	 
     }
}
class City {
    private String city;
    private String country;
	public City(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}