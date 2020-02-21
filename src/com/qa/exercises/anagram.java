package com.qa.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
	public boolean anagram(String a,String b) {
		a=a.replace("", "");
		b=b.replace("", "");
		
		char[] ArrayA = a.toLowerCase().toCharArray();
		char[] ArrayB= b.toLowerCase().toCharArray();
		     Arrays.sort(ArrayA);
		     Arrays.sort(ArrayB);
		     
		 return Arrays.equals(ArrayA, ArrayB);
		
	}

}
