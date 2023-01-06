package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleImmutableEntry<String, String> map = new AbstractMap.SimpleImmutableEntry<String, String>("Key1", "C++");
		
		/** getKey(): K **/									/// Map içinden key değerini getir.
		System.out.println("getKey: " + map.getKey());
	}
}