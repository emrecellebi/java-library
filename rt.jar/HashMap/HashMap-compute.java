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
		
		/** compute(K, BiFunction<? super K, ? super V, ? extends V>): V **/		/// Map verilen şarta göre karşılaştırma yapar.
		System.out.println("compute: " + map.compute("Key3", (k, v) -> (v != null) ? v : "is null"));
	}
}