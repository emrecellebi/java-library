package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// 
		sb.trimToSize();
		
		System.out.println("Trim To Size: " + sb);
	}
}