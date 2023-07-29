package com.Str;

public class ReverseStringEx {
	
	public static void performReverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println("Reverse string using builder method : "+builder);
		
		
		//Reverse String using iteration
		char[] charArray = str.toCharArray();
		String reverseString="";
		for(int i=charArray.length-1;i>=0;i--) {
			reverseString += charArray[i];
		}
		System.out.println("Reverse string using string iteration : "+reverseString);
		
	}
	
public static void main(String[] args) {
	
	performReverse("Ozair");
	
}
}
