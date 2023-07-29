package com.Str;

public class StringContainVowels {
	public static boolean stringContainVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		System.out.println(stringContainVowels("Khan"));
		System.out.println(stringContainVowels("wow"));
	}

}
