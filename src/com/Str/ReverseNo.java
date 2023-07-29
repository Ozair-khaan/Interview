package com.Str;

public class ReverseNo {
	public static void reverseNo(int num) {
		int rev = 0;
		int temp = num; // 123
		while (num != 0) {
			int rem = num % 10; // 3, 2, 1
			System.out.println("rem : " + rem);
			rev = rev * 10 + rem; // 3, 3*10+2=32, 32*10+0=320
			System.out.println("rev : " + rev);
			num = num / 10; // 12, 1,0
			System.out.println("num : " + num);
		}
		System.out.println(rev + " is the reverse of the number " + temp);
	}

	public static void main(String[] args) {
		reverseNo(123);

	}
}
