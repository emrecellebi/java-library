package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Belirtilen dizinden önceki karakteri (Unicode) döndürür
		System.out.println("codePointBefore: " + str.codePointBefore(1)); 
	}
}