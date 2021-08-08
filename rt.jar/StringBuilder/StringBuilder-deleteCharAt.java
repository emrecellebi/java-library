package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello World ");
		
		/// Bu konumdaki belirtilen karakteri kaldırır.
		System.out.println("Delete Char At: " + sb.deleteCharAt(2));
	}
}

