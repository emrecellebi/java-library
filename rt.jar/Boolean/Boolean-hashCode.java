package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Boolean bool = new Boolean("true");
		
		/// Karma kode döner.
		System.out.println("hashCode: " + bool.hashCode());
		
		/// Karma kode döner.
		System.out.println("hashCode: " + Boolean.hashCode(false));
	}
}