package io.dowlath.collections;

import java.util.Arrays;

public class MyOwnArrayList {
	// 1. get
	// 2. add
	// 3. increaseSize
	// 4. size
	// 5. remove
	
	private Object[] myStore;
	private int actSize = 0;
	
	MyOwnArrayList(){
		myStore = new Object[10];
	}
	
	public Object get(int index){
		if(index < actSize){
		  return myStore[index];
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}	
	
	public void add(Object obj){
		if(myStore.length - actSize<=5){
			increaseSize();
		}
		else{
			myStore[actSize++] = obj;
		}
		
	}
	
	private void increaseSize(){
		myStore = Arrays.copyOf(myStore,myStore.length*2);
		System.out.println("New size...:"+ myStore.length);
	}
	
	public Object remove(int index){
		if(index < actSize){
			Object obj = myStore[index];
			myStore[index] = null;
			int tmp = index;
			while(tmp < actSize){
				myStore[index] = myStore[index+1];
				myStore[index+1] = null;
				tmp++;
			}
			 actSize--;
			 return obj;
			}
	     throw new ArrayIndexOutOfBoundsException();
		}
		
	public int Size(){
		return myStore.length;
	}

}
