package com.Str;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Ozair";
		System.out.println(reverse(name));
	}

	public static String reverse(String in) {

		if (in == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}

		StringBuilder out = new StringBuilder();
		char[] charArray = in.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--)
			out.append(charArray[i]);
		return out.toString();

	}
}
