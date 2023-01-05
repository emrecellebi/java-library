package com.emrecellebi;

import java.util.LinkedHashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		/// Tanımlanan Sart gerçeklşir ise Map içerisindekileri siler.
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(){
			protected boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
			{
				System.out.println("removeEldestEntry");
				return false;
			}
		};
		
		/** put(K, V): V **/
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		System.out.println(map);
	}
}