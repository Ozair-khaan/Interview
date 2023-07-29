package com.Str;

public class UniqueCharOfString {
	public static void main(String[] args) {
		String str = "Java";// Jv
		char charr = str.toCharArray()[0];

		int i = str.indexOf(charr);
		if (i != -1) {
			System.out.println("String contains duplicate");

		}

		else {
			System.out.println("No Duplicate found");
		}

	}
}
