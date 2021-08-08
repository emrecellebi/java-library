package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Bu Dize içindeki, verilen dizinden codePointOffset kod noktalarına göre kaydırılan dizini döndürür.
		System.out.println("Offset By Code Points: " + sb.offsetByCodePoints(5, 5));
	}
}