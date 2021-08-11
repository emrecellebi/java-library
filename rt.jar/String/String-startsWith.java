package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu dizenin belirtilen ön ekle başlayıp başlamadığını test eder.
		System.out.println("Starts With: " + str.startsWith("Kleofia"));
		
		/// Verilen Stringi belirtilen değerde aramaya başlar. String, baslangic 
		System.out.println("Starts With: " + str.startsWith("McCormick", 8));
	}
}