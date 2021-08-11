package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu Dize içindeki, verilen dizinden codePointOffset kod noktalarına göre kaydırılan dizini döndürür.
		System.out.println("Offset By Code Points: " + str.offsetByCodePoints(5, 5));
	}
} 