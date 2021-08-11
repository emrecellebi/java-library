package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		StringBuffer sb = new StringBuffer("Kleofia McCormick");
		
		/// Bu dizeyi belirtilen CharSequence ile karşılaştırır.
		System.out.println("Content Equals: " + str.contentEquals("Kleofia McCormick"));
		
		/// Bu dizeyi belirtilen StringBuffer ile karşılaştırır.
		System.out.println("Content Equals: " + str.contentEquals(sb));
	}
}