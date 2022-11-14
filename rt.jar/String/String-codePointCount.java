package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu Dizenin belirtilen metin aralığındaki Unicode kod noktalarının sayısını döndürür
		System.out.println("codePointCount: " + str.codePointCount(0, 5)); 
	}
}