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
		
		/** remove(Object): V abstract **/							/// Map içeriğinden belirtilen Key değerini kaldırır.
		System.out.println("remove: " + map.remove("Key3"));
		
		/** remove(Object, Object): boolean **/				/// Map içeriğinden belirtilen Key ve Value değerleri eşit ise onu kaldırır dönüş olarak ise true döner.
		System.out.println("remove: " + map.remove("Key22", "22"));
		System.out.println("remove: " + map.remove("Key23", "22"));
	}
}