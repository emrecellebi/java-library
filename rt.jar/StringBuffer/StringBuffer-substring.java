package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Bu dizenin alt dizesi olan yeni bir dize döndürür.
		System.out.println("Sub String: " + sb.substring(5));
		
		/// Parametre: Başlangiç, Bitiş
		System.out.println("Substring: " + sb.substring(4, 12));
	}
}