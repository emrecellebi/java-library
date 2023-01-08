package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		System.setProperty("com.boolean.value", "true");
		
		/// Propertylerden boolean değerini döner.
		System.out.println("getBoolean: " + Boolean.getBoolean("com.boolean.value"));
	}
}