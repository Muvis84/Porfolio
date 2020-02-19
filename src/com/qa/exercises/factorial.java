package com.qa.exercises;

public class factorial {
	public static void main(String[] args) {
		int num = 6;
		System.out.println("factorial of " + num + " is " + factorial(6));
	}
	static int factorial(int i)
	{
		if (i==0)
			return 1;
		return i*factorial(i-1);
	}

}
