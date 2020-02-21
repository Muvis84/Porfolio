package com.qa.exercises;

public class FizzBuzzPop {
	public static void main() {
		
	}
	public String fizzBuzzPopsnap(int arg) {
		String res = " ";
		if(arg%3==0) {
			res =res +"Fizz";
			
		}
		if(arg%5==0) {
			res =res+"Buzz";
		}
		if(arg%7==0) {
			res = res +"Pop";
		}
		if(arg%11==0) {
			res=res+"Snap";
			
		}
		if(res.equals(" ")) {
			
			return res.toString();
			
		}
		
		return res;
	}
	

}
