package io.dowlath.collections;

import java.util.Arrays;

public class MyArrayListDemo {
     
	private Object[] myStore;
    private int actSize=0;
    
    MyArrayListDemo(){
    	myStore = new Object[10];    
    }
    
    public Object get(int index){
    	if(index<actSize){
    		return myStore[index];
    	}
    	else{
    		throw new ArrayIndexOutOfBoundsException();
    	}
    }
    
    public void add(Object obj){
    	if(myStore.length-actSize <=5){
    		increaseListSize();
    	}
    	else{
    		myStore[actSize++] = obj;
    	}
    }
    
    private void increaseListSize(){
    	myStore = Arrays.copyOf(myStore,myStore.length*2);
    	System.out.println("New Size....:"+myStore.length);
    }
    
    public Object remove(int index){
    	if(index<actSize){
    		Object obj = myStore[index];
    		int tmp = index;
    		while(tmp < actSize){
    			myStore[tmp] = myStore[tmp+1];
    			myStore[tmp+1] = null;
    			tmp++;
    		}
    		actSize--;
    		return obj;
    	}
    	throw new ArrayIndexOutOfBoundsException();
    }
    
    public int size(){
    	return actSize;
    	}

}
