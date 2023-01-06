package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleEntry<String, String> map2 = new AbstractMap.SimpleEntry<String, String>("Key1", "C++");
		AbstractMap.SimpleEntry<String, String> map = new AbstractMap.SimpleEntry<String, String>("Key1", "C++");
		
		/** equals(Object): boolean **/					/// Map içerisin deki belitilen nesneye eşşitlik kontrolü yapar
		System.out.println("equals: " + map.equals(map2));
		
	}
}