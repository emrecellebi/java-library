package com.emrecellebi;

import java.util.LinkedHashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		/** put(K, V): V **/
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		/** values(): Collection<V> **/									/// Map içindeki Value değerlerini döner.
		System.out.println("values: " + map.values());
	}
}