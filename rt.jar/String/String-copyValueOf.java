package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		char[] data = {'K', 'd', 's', 'f'};
		
		/// Belirtilen dizideki karakter dizisini temsil eden bir Dize döndürür.
		System.out.println("Copy Value Of: " + String.copyValueOf(data));
		
		/// Prametre Bir Data, Offset, Length
		System.out.println("Copy Value Of: " + String.copyValueOf(data, 0, 3));
	}
}