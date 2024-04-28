package io.dowlath.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String args[]){
		Queue<Item> items= new PriorityQueue<>();
		items.add(new Item("Sony",100));
		items.add(new Item("Samsung",200));
		items.add(new Item("Apple",300));
		items.add(new Item("Microsoft",400));
		items.add(new Item("Micromax",500));
		System.out.println("Elements in PQ : "+items);
		System.out.println("1  : "+items.poll());
		System.out.println("1 PQ : "+items);
		System.out.println("2  : "+items.poll());
		System.out.println("2 PQ : "+items);
		System.out.println("3  : "+items.poll());
		System.out.println("3 PQ : "+items);
		System.out.println("4  : "+items.poll());
		System.out.println("4 PQ : "+items);
		System.out.println("5  : "+items.poll());
		System.out.println("5 PQ : "+items);
		System.out.println("6  : "+items.poll());
		System.out.println("6 PQ : "+items);
	}
    static class Item implements Comparable<Item>{
    	private String itemName;
    	private int itemValue;    	
    	
		public Item(String itemName, int itemValue) {
			super();
			this.itemName = itemName;
			this.itemValue = itemValue;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getItemValue() {
			return itemValue;
		}
		public void setItemValue(int itemValue) {
			this.itemValue = itemValue;
		}
		public boolean equals(Object obj){
			if(this == obj) return true;
			if(obj==null) return false;
			if(this.getClass()!=obj.getClass()) return false;
			Item other = (Item)obj;
			if(this.itemValue != other.itemValue) return false;
			if(this.itemName==null){
				if(other.itemName!=null){
					return false;
				}
				else if (!this.itemName.equals(other.itemName))return false;			
		   }
			return true;
		}
        public int hashCode(){
        	final int primeNumber = 31;
        	int result = 1;
        	result = result * primeNumber + itemValue;
        	result = result * primeNumber + ((itemName == null) ? 0 : itemName.hashCode());
        	return result;
        }
        public int compareTo(Item i){
        	if(this.itemValue==i.itemValue){
        		return this.itemName.compareTo(i.itemName);
        	}
        	return this.itemValue - i.itemValue;
	    }
		@Override
		public String toString() {
			return "Item [itemName=" + itemName + ", itemValue=" + itemValue + "]";
		}
        
   }	
    	
}

