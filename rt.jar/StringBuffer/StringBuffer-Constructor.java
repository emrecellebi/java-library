package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		new StringBuffer();								/// Prametresiz Constructor
		new StringBuffer("Hello World");				/// CharSequence Prametresi Alır.
		new StringBuffer("Hello World");				/// String Prametresi Alır.
		new StringBuffer(25);							/// int Prametresi Alır.
	}
}