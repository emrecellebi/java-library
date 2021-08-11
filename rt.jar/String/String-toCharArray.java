package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu dizeyi yeni bir karakter dizisine dönüştürür.
		char[] s = str.toCharArray();
		
		for(char x : s)
			System.out.println("To Char Array: " + x);
	}
} 