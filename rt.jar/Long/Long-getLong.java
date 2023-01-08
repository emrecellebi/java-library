package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		/// Tanımlanan Propertyler içerisnde değeri çeker ve Long olarak döner.
		System.setProperty("com.long.value", "22");
		System.out.println("getLong: " + Long.getLong("com.long.value"));
		
		/// Tanımlı bir Property yok ise default değeri ver.
		System.out.println("getLong: " + Long.getLong("com.long", new Long("21")));
		
		/// Tanımlı bir Property yok ise default değeri ver.
		System.out.println("getLong: " + Long.getLong("com.long", 33));
	}
}