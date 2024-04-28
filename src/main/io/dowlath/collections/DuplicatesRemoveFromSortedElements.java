package io.dowlath.collections;

public class DuplicatesRemoveFromSortedElements {
  public static void main(String args[]){
	  int[] input = { 1,1,1,4,4,4,6,6,6,8,8,8,10};
	  int[] output = DuplicatesRemoveFromSortedElements.removedDuplicateElements(input);
	  for(int i : output){
		  System.out.print(" "+ i);
	  }
			  
  }
  public static int[] removedDuplicateElements(int[] input){
	  int j=0;
	  int i=1;
	  if(input.length <2){
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
