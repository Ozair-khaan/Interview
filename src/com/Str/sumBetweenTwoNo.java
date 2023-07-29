package com.Str;

public class sumBetweenTwoNo {
	public static int sumOfBwTwoNo(int start, int end) {
		if (start < end) {
			return end + sumOfBwTwoNo(start, end - 1);
		} else {
			return end;
		}
	}

	public static void main(String[] args) {
		int result = sumOfBwTwoNo(1, 10);
		System.out.println(result);
	}
}
