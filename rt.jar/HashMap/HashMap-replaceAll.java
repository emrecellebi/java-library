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
		
		/** replaceAll(BiFunction<? super K, ? super V, ? extends V>): void **/			/// Map içeriğinde belirtilen Key ve Value değerlerini toplu değiştirir.
		map.replaceAll((k, v) -> v + "-!-");
	}
}