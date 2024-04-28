package io.dowlath.dsa.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateString {
	public static void main(String args[]){
	FindDuplicateString fds = new FindDuplicateString();
	fds.duplicateStingFinding("Basha");
 }
	
	public void duplicateStingFinding(String str){
		Map<Character, Integer> duMap = new HashMap<Character,Integer>();
		char[] chr = str.toCharArray();
		for(Character ch : chr){
			if(duMap.containsKey(ch)){
				duMap.put(ch, duMap.get(ch)+1);
			}
			else{
				duMap.put(ch,1);
			}
		}
		Set<Character> key = duMap.keySet();
		for(Character chKey : key){
			  if(duMap.get(chKey)>1){
				  System.out.println(chKey+"<-------------------------->"+duMap.get(chKey));
			  }
		}
		
	}
}

