package com.emrecellebi;

import java.util.HashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		
		/** put(K, V): V **/
		map.put("Key1", "C++");
		map.put("Key2", "Ruby");
		map.put("Key3", "Java");
		map.put("Key4", "Assembly");
		
		/** putIfAbsent(K, V): V **/							/// Map içerisinde Belitilen Key değeri var ise onun değerini döner. Yok ise belitilen Value ile eşletirir. dönüş olarak null döner.
		System.out.println("putIfAbsent: " + map.putIfAbsent("Key3", "88"));
		System.out.println("putIfAbsent: " + map.putIfAbsent("Key6", "GB"));
	}
}