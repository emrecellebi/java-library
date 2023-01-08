package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Boolean bool = new Boolean("true");
		
		/// Boolean nesenesi ile karşılaştırır.
		System.out.println("equals: " + bool.equals(new Boolean(true)));
	}
}