package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Kapasitenin belirtilen değerde sınırlar.
		sb.ensureCapacity(25);
	}
}