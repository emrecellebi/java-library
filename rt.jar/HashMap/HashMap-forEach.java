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
		
		/** forEach(BiConsumer<? super K, ? super V>): void **/
		map.forEach((k, v) -> System.out.println("Key: " + k + " - " + "Value: " + v));
	}
}