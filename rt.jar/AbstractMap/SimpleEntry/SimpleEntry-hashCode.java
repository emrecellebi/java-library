package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleEntry<String, String> map = new AbstractMap.SimpleEntry<String, String>("Key1", "C++");
		
		/** hashCode(): int **/									/// Map için bir hash kode üretir
		System.out.println("hashCode: " + map.hashCode());
	}
}