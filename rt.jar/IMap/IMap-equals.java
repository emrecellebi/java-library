package com.emrecellebi;

import java.util.HashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		Map<String, String> map2 = new HashMap<String, String>();
		
		map2.put("Key1", "C++");
		map2.put("Key2", "Ruby");
		map2.put("Key3", "Java");
		map2.put("Key4", "Assembly");
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		/** equals(Object): boolean abstract **/					/// Map içerisin deki belitilen nesneye eşşitlik kontrolü yapar
		System.out.println("equals: " + map.equals(map2));
		
	}
}