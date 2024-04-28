package io.dowlath.collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseListandMinandMaxValueFromArrayList {
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10000000);
		list.add(1);
		list.add(0);
		list.add(-1);
		list.add(2);
		list.add(67);
		// Max & Min
		int min = list.get(0);
		int max = list.get(0);
		for(Integer i : list){
			if(i<min) min=i;
			if(i>max) max=i;			
		}
		System.out.println("Max Ele....list : "+max);
		System.out.println("Min Ele....list : "+min);
		
		//reverseList
		System.out.println("Before reverse list...:"+list);
		reverse(list);
		System.out.println("Reverse List...:"+list);
	}
	public static List<Integer> reverse(ArrayList<Integer> al){
		if(al.size() >1 ){
			int value = al.remove(0);
			reverse(al);
			al.add(value);
		}
		return al;
	}

}
