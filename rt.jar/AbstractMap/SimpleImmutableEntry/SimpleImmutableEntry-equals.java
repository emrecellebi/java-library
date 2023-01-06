package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleImmutableEntry<String, String> map2 = new AbstractMap.SimpleImmutableEntry<String, String>("Key1", "C++");
		AbstractMap.SimpleImmutableEntry<String, String> map = new AbstractMap.SimpleImmutableEntry<String, String>("Key1", "C++");
		
		/** equals(Object): boolean **/					/// Map içerisin deki belitilen nesneye eşşitlik kontrolü yapar
		System.out.println("equals: " + map.equals(map2));
		
	}
}