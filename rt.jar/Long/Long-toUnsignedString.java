package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		/// Verilen değeri eksili değeri olmadan döner.
		System.out.println("toUnsignedString: " + Long.toUnsignedString(22));
		
		/// Verilen değeri verilen tabana göre eksili değeri olmadan döner.
		System.out.println("toUnsignedString: " + Long.toUnsignedString(22, 2));
	}
}