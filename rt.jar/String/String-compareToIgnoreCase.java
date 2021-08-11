package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";

		/// İki dizeyi sözlük tabanlı Büyük Küçük Harfe Duyarlı olarak karşılaştırır.
		System.out.println("Compare Ignore Case: " + str.compareToIgnoreCase("Kleofia McCormick"));
	}
}