package com.qa.exercises;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueList {
	public static void main() {
		System.out.println("");
		
	}

	public static String uniqueLetters(String sentence) {
		return Arrays.asList(sentence.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining(""));
	}
}
