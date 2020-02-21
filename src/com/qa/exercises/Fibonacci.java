package com.qa.exercises;

public class Fibonacci {
	public static int fibonacciSequence(int num) {
		int f[] = new int[num+2];
		int i;
		f[0] = 0;
		f[1]=1;
		
		for(i=2;i<=num; i++) {
			f[i] =f[num-1]+f[num-2];
		}
		return f[num];
	}
	public static void main(String[] args) {
		int num = 40;
		System.out.println(fibonacciSequence(num));
		
	}

}
