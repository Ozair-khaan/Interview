package com.Str;

public class Palindrome {
	public static void palindrome(int num) {
		int rev = 0;
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is the palindrome number ");
		} else {
			System.out.println(temp + " is not a palindrome number.");
		}
	}

	public static void main(String[] args) {
		palindrome(121);
	}
}
