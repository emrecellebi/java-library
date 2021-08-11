package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu dizenin alt dizesi olan yeni bir dize döndürür.
		System.out.println("Substring: " + str.substring(4));
		
		/// Parametre: Başlangiç, Bitiş
		System.out.println("Substring: " + str.substring(4, 12));
	}
} 