package io.dowlath.collections;

public class DuplicateElementsRemovesFromArray {
	public static void main(String args[]){
		int[] input = {1,4,7,2,2,2,7,7,8,8};
		DuplicateElementsRemovesFromArray.removeDuplicates(input);
	}
	
	public static void removeDuplicates(int[] arr){
		for(int i=0;i<arr.length;i++){
			boolean isDistinct = false;
			for(int j=0;j<i;j++){
				if(arr[i] == arr[j]){
					isDistinct = true;
				}
			}
			if(!isDistinct){
				System.out.print(" "+arr[i]);
			}
		}
	}
}
