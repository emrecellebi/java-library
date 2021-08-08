package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Bu Dizenin belirtilen metin aralığındaki Unicode kod noktalarının sayısını döndürür
		System.out.println("Code Point Count: " + sb.codePointCount(0, 5)); 
	}
}