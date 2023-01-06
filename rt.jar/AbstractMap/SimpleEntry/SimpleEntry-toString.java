package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleEntry<String, String> map = new AbstractMap.SimpleEntry<String, String>("Key1", "C++");
		
		/** toString(): String **/						/// Map bir String olarak döner.
		System.out.println("toString: " + map.toString());
	}
}