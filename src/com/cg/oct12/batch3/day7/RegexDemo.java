package com.cg.oct12.batch3.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		// String regex="[a-z]";
		String input="12";
		//String regex="[//w]";
		String regex="[a-zA-Z]";
		String regex="[//d]";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(input);
		
		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());
		
	}

}
