package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello World ");
		
		/// Bu dizinin bir alt dizisindeki karakterleri kaldırır
		/// Parameters: start, end
		System.out.println("Delete: " + sb.delete(2, 8));
	}
}

