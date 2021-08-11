package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		/// Geçerli System Haritası Dondürür
		System.out.println(System.getenv());
		
		/// Belitilen Değişken Adının değerini yazdırır
		System.out.println(System.getenv("MyPath"));
	}
}