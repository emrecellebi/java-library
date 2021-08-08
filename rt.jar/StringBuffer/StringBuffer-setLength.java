package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Belirtilen dizenin uzunlunu ayarlar
		sb.setLength(25);
		
		System.out.println("Set Length: " + sb);
	}
}