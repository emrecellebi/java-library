package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleEntry<String, String> map = new AbstractMap.SimpleEntry<String, String>("Key1", "C++");
		
		/** getKey(): K **/									/// Map içinden key değerini getir.
		System.out.println("getKey: " + map.getKey());
	}
}