package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Bu dizinin bir alt dizesindeki karakterleri belirtilen Dize'deki karakterlerle değiştirir.
		/// Parameters: start, end, değer
		System.out.println("Replace: " + sb.replace(5, 5, "ZEY"));
	}
}