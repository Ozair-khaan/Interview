package com.Str;

public class PrintingOnlyUnique {
	public static void main(String[] args) {
		String s1 = "development";
	
		for (int i = 0; i < s1.length(); i++) {
			int flag = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j) && i != j) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(s1.charAt(i));
			}
		}
	}
}
