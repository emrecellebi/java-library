package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu dizeyi belirtilen Dizi büyük küçüğe duyarlı olarak karşılaştırır.
		System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("Kleofia McCormick"));
	}
}