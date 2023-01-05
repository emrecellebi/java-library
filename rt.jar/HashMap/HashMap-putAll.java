package com.emrecellebi;

import java.util.HashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		/** put(K, V): V **/
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Key22", "22");
		map2.put("Key23", "2018");
		map2.put("Key24", "2022");
		
		/** putAll(Map<? extends K, ? extends V>): void abstract **/				/// Map içeriğine ikinci bir Map tipinde listeyi alır.
		map.putAll(map2);
	}
}