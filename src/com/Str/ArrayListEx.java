package com.Str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
