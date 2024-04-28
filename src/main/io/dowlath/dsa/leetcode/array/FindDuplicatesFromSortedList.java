package io.dowlath.dsa.leetcode.array;

public class FindDuplicatesFromSortedList {
	public static void main(String args[]){
		int[] input = { 4,6,6,6,7,9};
		int[] output = duplicateRemoved(input);
		for(int i : output){
			System.out.print(" " +i);
		}
	}
	static int[] duplicateRemoved(int[] input){
		int j=0;
		int i=1;
		if(input.length < 2){
			return input;
		}
		while(i<input.length){
			if(input[i] == input[j]){
				i++;
			}
			else{
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j+1];
		for(int k=0;k<output.length;k++){
			output[k] = input[k];
		}
		return output;
	}

}
