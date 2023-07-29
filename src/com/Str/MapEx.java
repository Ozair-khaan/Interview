package com.Str;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("101", "Ozair");
	map.put("102", "Khan");
	map.put("103", "Omair");
	map.put("101", "Zaid");
	
	for(Map.Entry <String, String> m: map.entrySet()) {
		System.out.println("Key = "+m.getKey()+" Value = "+m.getValue());
	}
	
}
}
