package io.dowlath.dsa.leetcode.string;

public class ReverseString {
   public static void main(String ags[]){
	   String str = "Dowlath";
	   System.out.println(ReverseString.reverseString(str));
	   
   }
   
   static String reverseString(String str){
	   String reverse = " ";
	   if(str.length() == 1){
		   return str;
	   }
	   reverse = reverse +str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
	   return reverse;
   }
}
