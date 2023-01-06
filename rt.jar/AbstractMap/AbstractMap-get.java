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
		
		/** get(Object): V **/									/// Map içinde belirtilen Key değerinin Value değerini verir.
		System.out.println("get: " + map.get("Key2"));
	}
}