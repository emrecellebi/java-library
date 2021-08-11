package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Belirtilen dizindeki karakteri (Unicode) döndürür.
		System.out.println("Unicode: " + str.codePointAt(0)); 
	}
}