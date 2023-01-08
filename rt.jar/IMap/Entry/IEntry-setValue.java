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
			/** setValue(V): V **/									/// Map için value değerini değiştir. Geri dönüş olarak eski değeri verir.
			if(entry.getKey().equals("Key3")) System.out.println("setValue: " + entry.setValue("----"));
		}
	}
}