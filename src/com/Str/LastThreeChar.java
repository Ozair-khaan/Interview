package com.Str;

public class LastThreeChar {
	public static void main(String[] args) {

		String str = "Jammu and Kashmir";

		int initial = str.length() - 3;

		for (int i = initial; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}
}
