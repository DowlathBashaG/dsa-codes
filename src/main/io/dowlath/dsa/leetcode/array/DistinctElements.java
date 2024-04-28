package io.dowlath.dsa.leetcode.array;

public class DistinctElements {
	public static void main(String args[]){
		int[] a = {10,4,4,4,4,3,3,3,2,2,1,100};
		DistinctElements.myDistinctElements(a);
		
	}
    static void myDistinctElements(int[] a){
    	for(int i=0;i<a.length;i++){
    		boolean isDistinct = false;
    		for(int j=0;j<i;j++){
    			if(a[i]==a[j]){
    				isDistinct = true;
    				break;
    			}
    		}
    		if(!isDistinct){
    			System.out.print("  "+a[i]);
    		}
    	}
    }
}
