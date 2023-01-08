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
		
		/** merge(K, V, BiFunction<? super V, ? super V, ? extends V>): V **/		/// Map içerisinde belirtilen Key ve Value değeri yok ise yeni bir değer olarak ekler. Key değeri var ise value değerini değiştirir.
		System.out.println("merge: " + map.merge("Key5", "22", (oldValue, newValue) -> oldValue + newValue));
		System.out.println("merge: " + map.merge("Key3", "22", (oldValue, newValue) -> oldValue + newValue));
	}
}