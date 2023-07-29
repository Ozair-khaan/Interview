package com.Str;

public class ValueExchange {

	int value;

	static int getValue(int value) {
		return (3 - value);
	}

	public static void main(String[] args) {

		System.out.println(ValueExchange.getValue(2));
	}
}
