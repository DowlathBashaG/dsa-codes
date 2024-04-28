package io.dowlath.dsa.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetableCharacter {
	public static void main(String args[]){
		String s = "eHelloH";
        Character c = nonRepeatableCharacter(s);
        System.out.println(c);
	}
	
	private static Character nonRepeatableCharacter(String str){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int length = str.length();
		Character c;
		for(int i=0;i<length;i++){
			c=str.charAt(i);
			if(map.containsKey(map.get(c))){
				map.put(c,map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		for(int i=0;i<length;i++){
			c = str.charAt(i);
			if(map.get(c)==1){
				return c;
			}
		}
		return null;
		
	}

}
