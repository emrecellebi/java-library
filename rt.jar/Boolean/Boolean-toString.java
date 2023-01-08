package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Boolean bool = new Boolean("true");
		
		/// Boolean nesnesini String olarak döner.
		System.out.println("toString: " + bool.toString());
		
		/// boolean değerini String olarak döner.
		System.out.println("toString: " + Boolean.toString(false));
	}
}