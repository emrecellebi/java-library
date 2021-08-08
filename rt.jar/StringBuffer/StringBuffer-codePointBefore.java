package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Belirtilen dizinden önceki karakteri (Unicode) döndürür
		System.out.println("Code Point Before: " + sb.codePointBefore(1)); 
	}
}