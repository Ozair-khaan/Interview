package com.Str;

public class VectorEx {

	public static void main(String[] args) {

		int temp, rem, sum = 0;

		int num = 165;
		temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
