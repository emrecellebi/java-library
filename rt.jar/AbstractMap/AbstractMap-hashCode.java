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
		
		/** hashCode(): int **/									/// Map için bir hash kode değeri döner
		System.out.println("hashCode: " + map.hashCode());
	}
}