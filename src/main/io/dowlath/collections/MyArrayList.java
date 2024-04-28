package io.dowlath.collections;

import java.util.Arrays;

public class MyArrayList{
	
	// 1. get
	// 2. add
	// 3. increase
	// 4. size
	// 5. remove
	
	private Object[] myStore;
	private int actSize = 0;
	
	MyArrayList(){
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
		if(myStore.length - actSize <=5){
			increaseSize();
		}
		else{
			 myStore[actSize++] = obj;
		}
	}
	
	private void increaseSize(){
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("New length....:"+myStore.length);
	}
	
	public Object remove(int index){
		if( index < actSize){
			Object obj = myStore[index];
			int tmp = index;
			while(tmp < actSize) {
				myStore[tmp] = myStore[tmp+1];
				myStore[tmp+1] = null;
				tmp++;
			}
			  actSize--;
			  return obj;		    
			}
		 return false;
     }
	
	public int size(){
		return actSize;
	}
}