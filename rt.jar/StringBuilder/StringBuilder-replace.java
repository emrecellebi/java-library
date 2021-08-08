package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "emrecellebi";
		
		StringBuilder sb = new StringBuilder("Hello World ");
		
		/// Bu dizinin bir alt dizesindeki karakterleri belirtilen Dize'deki karakterlerle değiştirir.
		/// Parameters: start, end, değer
		System.out.println("Replace: " + sb.replace(3, 6, str));
	}
}

