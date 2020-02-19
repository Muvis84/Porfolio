package com.qa.exercises;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(palindrome("borroworrob"));
		System.out.println(palindrome("racecar"));
		
	}
	
	public static  boolean palindrome(String sentence) {
		sentence = sentence.replace(" ", " ").toLowerCase();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(sentence);
		stringBuilder.reverse();
		return sentence.equals(stringBuilder.toString());
	}
	

}
