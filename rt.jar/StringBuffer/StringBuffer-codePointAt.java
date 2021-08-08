package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Belirtilen dizindeki karakteri (Unicode) döndürür.
		System.out.println("Code Point At: " + sb.codePointAt(0));
	}
}