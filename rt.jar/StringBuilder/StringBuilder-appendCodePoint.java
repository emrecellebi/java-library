package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello World ");
		
		/// UniCode tipinde bir karaker ekler
		System.out.println("Append Code Point: " + sb.appendCodePoint(35));
	}
}

