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
		
		/** replace(K, V): V **/					/// Map içerisinde belitilen Key var ise Belitilen Value ile değiştir. dönüş olarak ise Value değerini döner. Key yok ise Value değeri null olarak döner.
		System.out.println("replace: " + map.replace("Key24", "----"));
		
		/** replace(K, V, V): boolean **/			/// Map içerisinde belirtilen Key ve Value değeri var ise Value ile değiştir. dönüş olarak da true döner.
		System.out.println("replace: " + map.replace("Key23", "2018", "----"));
	}
}