package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Belirtilen dizindeki karakteri verilen karakter ile değiştirir.
		sb.setCharAt(2, 't');
		
		System.out.println("Set Char At: " + sb);
	}
}