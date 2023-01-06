package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleImmutableEntry<String, String> map = new AbstractMap.SimpleImmutableEntry<String, String>("Key1", "C++");
		
		/** hashCode(): int **/									/// Map için bir hash kode üretir
		System.out.println("hashCode: " + map.hashCode());
	}
}