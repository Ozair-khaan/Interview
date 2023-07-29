package com.Str;

public class ReferCheck {
	public static void main(String[] args) {
		String s1 = "Ozair";
		String s2 = s1;
		System.out.println(s2 == s1);

		s2 += "khan";
		System.out.println(s2);
		System.out.println(s1 == s2);
	}
}
