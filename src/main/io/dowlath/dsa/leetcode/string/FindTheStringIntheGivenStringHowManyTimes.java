package io.dowlath.dsa.leetcode.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheStringIntheGivenStringHowManyTimes {
	public static void main(String args[]){
		String str = "HelloafaeaerHelloaeareaeeHelloafarerreHello";
		Pattern pattern = Pattern.compile("Hello");
		Matcher matcher = pattern.matcher(str);
		int occurance =0;
		while(matcher.find()){
			occurance++;
		}
		System.out.println("No of times it occured...:"+occurance);		
	}

}
