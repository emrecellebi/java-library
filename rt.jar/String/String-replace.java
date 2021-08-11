package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia-McCormick";
		
		/// Bu dizedeki tüm oldChar oluşumlarını newChar ile değiştirmekten kaynaklanan yeni bir dize döndürür.
		System.out.println("Replace: " + str.replace('-', ' '));
		
		
		System.out.println("Replace: " + str.replace("fia", 'ick'));
	}
} 