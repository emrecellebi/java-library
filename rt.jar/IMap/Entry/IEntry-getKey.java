package com.emrecellebi;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for(Map.Entry<String, String> entry : entrys)
		{
			/** getKey(): K abstract **/					/// Map içinden key değerini getir.
			System.out.println("getKey: " + entry.getKey());
		}
	}
}