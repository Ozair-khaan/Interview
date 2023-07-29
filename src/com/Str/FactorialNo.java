package com.Str;

public class FactorialNo {

	public static void main(String[] args) {
		int i, fact = 1;
		int num = 5;

		for (i = 1; i <= num; i++) {
			fact = fact * i; // 1,2,6,24,120
		}
		System.out.println("Factorial of " + num + " is :" + fact);
	}

}
