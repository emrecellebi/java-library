package com.emrecellebi;

import java.util.HashMap;
import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap<String, String> map = new HashMap<String, String>();
		
		/** put(K, V): V **/
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		/** toString(): String **/						/// Map bir String olarak döner.
		System.out.println("toString: " + map.toString());
	}
}