package com.emrecellebi;

import java.util.AbstractMap;

public class Console
{
	public static void main(String[] args)
	{
		AbstractMap.SimpleEntry<String, String> map = new AbstractMap.SimpleEntry<String, String>("Key1", "C++");
		
		/** setValue(V): V **/							/// Map için value değerini değiştir. Geri dönüş olarak eski değeri verir.
		System.out.println("setValue: " + map.setValue("Ruby"));
	}
}