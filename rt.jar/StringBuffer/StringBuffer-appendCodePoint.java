package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Unicode değerini bir string olarak ekler.
		System.out.println("Append Code Point: " + sb.appendCodePoint(35));
	}
}