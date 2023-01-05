package com.emrecellebi;

import java.util.HashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		/** put(K, V): V **/						/// Map içeriğine key ve Value değeri ekler.
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
	}
}