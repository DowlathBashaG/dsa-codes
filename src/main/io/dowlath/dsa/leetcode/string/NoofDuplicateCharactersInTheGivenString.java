package io.dowlath.dsa.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoofDuplicateCharactersInTheGivenString {
	public static void main(String args[]){
		String str="Dowlath Basha";
		duplicateCharactersCount(str);
	}
	
	public static void duplicateCharactersCount(String str){
		Map<Character,Integer> duMap = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for(Character chr : ch){
			if(duMap.containsKey(chr)){
				duMap.put(chr,duMap.get(chr)+1);
			}
			else{
				duMap.put(chr,1);
			}
		}
		Set<Character> set = duMap.keySet();
		for(Character sortingCharacter : set){
			if(duMap.get(sortingCharacter)>1)
			System.out.println(sortingCharacter+" <-----> "+duMap.get(sortingCharacter));
		}
	}
   
}
